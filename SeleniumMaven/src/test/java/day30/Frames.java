package day30;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames");
		 driver.manage().window().maximize();
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		//Inner frame in frame3
		driver.switchTo().frame(0); //Switching using index
		//driver.findElement(By.xpath("//label[@for='i8']//div[contains(@class,'bzfPab')]")).click();
		WebElement rdbtn = driver.findElement(By.xpath("//label[@for='i8']//div[contains(@class,'bzfPab')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",rdbtn );
		driver.switchTo().defaultContent();
		WebElement frame5 =driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		//driver.switchTo().frame(frame5);
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(frame5);
		
		Robot rb = new Robot();
		for(int i=0;i<=2;i++) {
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_MINUS);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_MINUS);
		
		}
		
		
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("abcde");
		WebElement link = driver.findElement(By.xpath("//a[@href='https://a9t9.com']"));
		link.click();
		//js.executeScript("arguments[0].ScrollInToView()", link);
		
		
		 // Actions act = new Actions(driver); 
		  //act.keyDown(Keys.ARROW_DOWN).perform();
		  //act.scrollToElement(link); link.click();
		 
		
		
			
		
		
	}

}
