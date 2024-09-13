package Day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assaignmet_table {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.xpath("//select[@name='toPort']"))).selectByIndex(2);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println(rows);
		//driver.navigate().refresh();
		
		List<Integer> a = new ArrayList<Integer>();
		for(int r=0;r<=rows;r++) {
			int price =Integer.parseInt(driver.findElement(By.xpath("//table[@class='table']//tr//td[6]")).getText());
			System.out.println(price);
			
			/*
			 * int p=Integer.parseInt(price); System.out.println(p); a.add(p);
			 */
			 
		}
		//System.out.println(price);
		

	}

}
