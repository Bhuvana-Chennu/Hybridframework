package day25;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> wind_id=driver.getWindowHandles();
		//Approach1
		List<String> Windid_list = new ArrayList<String>(wind_id);
		String parent_id = Windid_list.get(0);
		String child_id = Windid_list.get(1); 
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle()); //Human Resources Management Software | OrangeHRM
		
		driver.switchTo().window(parent_id); 
		System.out.println(parent_id); ////ORANGE HRM parent window 
		
		for(String id:Windid_list) {
			String title = driver.switchTo().window(id).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

		
		

		
		
		

	}

}
