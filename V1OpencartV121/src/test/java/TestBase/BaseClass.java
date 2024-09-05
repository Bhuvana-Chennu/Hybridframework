package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public WebDriver driver;
public Logger logger;
public Properties p;
	
	@BeforeClass(groups= {"Sanity","Regression","Master"}) //Master includes all groups sanity regression......
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws IOException
	{
		//Loading config.properties file
		FileReader file = new FileReader("./src//test//resources//Config.properties");
		p = new Properties();
		p.load(file);
		
		
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver();  break;
		case "firefox" : driver = new FirefoxDriver();  break;
		default: System.out.println("Invalid browser"); return;
		}
	
		
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appURL")); //reading url from properties file	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
	}
	
	
	@AfterClass(groups= {"Sanity","Regression","Master"})
	public void teardown()
	{
		
	driver.quit();
	}

	public String randomString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randonNumber()
	{
		String num =RandomStringUtils.randomNumeric(10);
		return num;
	}
	
	public String randomAlphanumeric()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return(generatedstring+"@"+generatednumber);
	}
	
	public String captueScreen(String tname) {
		String TimeStamp =new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String targetfilepath = System.getProperty("user.dir")+"\\screenshots"+tname+"_"+TimeStamp;
		File targetfile = new File(targetfilepath);
		
		sourcefile.renameTo(targetfile);
		
		return targetfilepath;
		
		
	}

}
