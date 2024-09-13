package Day32;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//table[@name='BookTable']"));
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No. of rows" + " "+rows);
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No. of columns" +" "+cols);
		String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[4]")).getText();
		System.out.println(price);
		System.out.println("BookName"+"\t" + "Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				
				String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		/*
		 * for(int r=2;r<=rows;r++) {
		 * 
		 * String
		 * authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
		 * "]//td[2]")).getText();
		 * 
		 * if(authorname.equals("Mukesh")) { String
		 * BookNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
		 * "]/td[1]")).getText(); System.out.println(BookNames + "\t"+ authorname); }
		 * 
		 * } int total=0; for(int r=2;r<=rows;r++) { String price1 =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).
		 * getText(); //System.out.println(price1);
		 * total=total+Integer.parseInt(price1);
		 * 
		 * } System.out.println(total);
		 */
	}

}
