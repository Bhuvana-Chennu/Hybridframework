package day25;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_Specific_Window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> wind_id=driver.getWindowHandles();
		Iterator it = wind_id.iterator();
		while(it.hasNext()) {
			Object id = it.next();
			String s = (String) id;
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")||title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
				
			}
			
		}

	}

}
