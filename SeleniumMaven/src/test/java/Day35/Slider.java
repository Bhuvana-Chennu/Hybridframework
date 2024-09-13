package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://jqueryui.com/slider/#hotelrooms");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"));
		Point location = slider.getLocation(); //(9,28)
		System.out.println(location);
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(slider, 300, 28).perform();
		System.out.println("current location of slider after dragging:" + slider.getLocation());
		
		
		

	}

}