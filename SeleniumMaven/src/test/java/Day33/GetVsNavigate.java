package Day33;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.interviewbit.com/selenium-interview-questions/?sign_up_medium=ib_article_auth_blocker/");
		driver.navigate().to("https://www.interviewbit.com/selenium-interview-questions/?sign_up_medium=ib_article_auth_blocker/");
		
	}

}
