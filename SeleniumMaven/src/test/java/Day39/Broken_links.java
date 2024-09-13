package Day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int no_of_brokenlinks=0;
		for(WebElement l:links) {
			String hrefvalue = l.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("Not possible to check wheather the link is broken or not");
				continue;
			}
			try 
			{
			URL linkurl = new URL(hrefvalue);
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefvalue+"=======>It is a broken link");
				no_of_brokenlinks++;
			}
			else {
				System.out.println(hrefvalue+"=======Not a broken link");
			}
			}
			catch(Exception e)
			{
			}
			
			
			}
		System.out.println("No of broken links:"+no_of_brokenlinks); //42
		

	}

}
