package Day41;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fd_Calculator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html#:~:text=This%20Fixed%20Deposit%20(FD)%20Calculator%20helps%20you%20find%20out%20how");
		driver.manage().window().maximize();
		
		String filepath = "";
	}

}
