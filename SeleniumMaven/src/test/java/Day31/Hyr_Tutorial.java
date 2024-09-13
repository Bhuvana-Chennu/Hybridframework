package Day31;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr_Tutorial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/");
		
		driver.findElement(By.linkText("Buy me a coffee")).click();
		Set<String> id= driver.getWindowHandles();
		List<String> id_list =new ArrayList<String>(id);
		String par_id=id_list.get(0);
		String chi_id = id_list.get(1);
		String tit=driver.switchTo().window(chi_id).getTitle();
		System.out.println(tit);
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='3']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'w-full tw-remove-default-styling')])[2]")).sendKeys("Bhuvana");
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'Say something')]")).sendKeys("I dont likeautomatiom");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='emoji-picker-toggle text-18 cursor-pointer group/emojiIcon']")).click();
		  //.for(int i=0;i<4;i++) { smiley.get(i).click(); }
		 
		//System.out.println(smiley.size());
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[text()='😄']")).click();
		//smiley.get(4).click();
		List<WebElement> smiley = driver.findElements(By.xpath("//div[contains(@class,'bg-white shadow-lg border border-dark/5 ')]//div[@class='text-2xl cursor-pointer hover:bg-dark/5 flex justify-center items-center rounded-lg']"));		
		for(WebElement s:smiley) {
			s.click();
		}
		
	}

}
