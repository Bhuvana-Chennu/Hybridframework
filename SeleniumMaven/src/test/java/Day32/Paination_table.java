package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paination_table {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.opencart.com/admin/");
		WebElement username =driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[text()='Customers']")).click();
		String txt =driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(txt); //Showing 1 to 10 of 20354 (2036 Pages)
		int total_pages = Integer.parseInt(txt.substring(txt.indexOf("(")+1,txt.indexOf("Pages")-1));
		System.out.println(total_pages);
		for(int p=1;p<=5;p++)
		{
			if(p>1) {
				WebElement actv_pg = driver.findElement(By.xpath("//a[text()="+p+"]"));
				actv_pg.click();
				Thread.sleep(3000);
				}
		int rows=driver.findElements(By.xpath("//table[contains(@class,'table')]//tbody//tr")).size();
		for(int r=2;r<=rows;r++) {
		String cust_name=driver.findElement(By.xpath("//table[contains(@class,'table')]//tbody//tr["+r+"]//td[2]")).getText();
		String email= driver.findElement(By.xpath("//table[contains(@class,'table')]//tbody//tr[2]//td[3]")).getText();
		String status = driver.findElement(By.xpath("//table[contains(@class,'table')]//tbody//tr[2]//td[5]")).getText();
		System.out.println(cust_name + "\t" + email + "\t" + status);
		
		}
		}
		
			
		

	}

}
