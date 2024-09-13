package Day34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_6gwjrxu9p1_e&adgrpid=1341405838299434&hvadid=83838130693493&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=116074&hvtargid=kwd-83838874655187:loc-90&hydadcr=28884_11845482");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		//List<WebElement> images= driver.findElements(By.tagName("img"));
		//System.out.println(images.size());

	}

}
