package Day36;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.facebook.com/");
		File sourceFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\testing\\SeleniumMaven\\src\\Screenshots\\fb.2.jpg");
		//File destFile = new File("C:\\Users\\Dell\\Pictures/fb.png");
		Files.copy(sourceFile, destFile);
		System.out.println("ScreenShot captured successfully");
		
		//ByteArray
		
		byte[] byteArry = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BYTES);
		File destFile1 = new File("C:\\testing\\SeleniumMaven\\src\\Screenshots\\img.png");
		FileOutputStream fos = new FileOutputStream(destFile1);
		fos.write(byteArry);
		fos.close();
		//File destFile = new File("C:\\Users\\Dell\\Pictures/fb.png");
		
		
		System.out.println("ScreenShot captured successfully");
		
		//BASE64
		String base64code =((RemoteWebDriver)driver).getScreenshotAs(OutputType.BASE64);
		byte[] bytearray = Base64.getDecoder().decode(base64code);
		File dest2 = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\bhuvana1.png");
		FileOutputStream fos1 = new FileOutputStream(dest2);
		fos1.write(bytearray);
		fos1.close();
		

	}

}
