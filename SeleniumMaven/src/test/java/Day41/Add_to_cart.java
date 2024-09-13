package Day41;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Add_to_cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		ele.click();
		driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
		driver.findElement(By.xpath("//img[@alt='Alt 1']")).click();
		driver.findElement(By.xpath("//img[contains(@class,'optimized-rendering') and @data-image-index='1']")).click();
		Set<String> tabid = driver.getWindowHandles();
		List<String> id = new ArrayList(tabid);
		driver.switchTo().window(id.get(1));
		new Select(driver.findElement(By.id("quantity"))).selectByValue("2");
		
		driver.findElement(By.xpath("//div[@id='qualifiedBuybox']//input[@id='add-to-cart-button']")).click();
		String price = driver.findElement(By.xpath("//div[@id='sw-subtotal']//span[@class='a-price-whole']")).getText();
		
		String prise1 = "5899";
		String prise2 = "5899";
		
		int p1 = Integer.parseInt(prise1);
		int p2 = Integer.parseInt(prise2);
		 int sum = p1+p2;
		
		 if (sum==11798) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}
		System.out.println(sum);
		driver.close();
		
		

	}

}
