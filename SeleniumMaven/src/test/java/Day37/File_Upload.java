package Day37;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		/*
		 * driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(
		 * "C:\\Users\\Dell\\Documents\\python"); String file_name =
		 * driver.findElement(By.xpath("//ul[@id='fileList']")).getText();
		 * if(file_name.equals("python")) {
		 * System.out.println("File is sucessfuly uploaded"); } else {
		 * System.out.println("File is not uploaded"); }
		 */
		
		String file1="C:\\Users\\Dell\\Downloads";
		String file2 = "C:\\Users\\Dell\\Documents\\python";
		driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(file1+"\n"+file2);
		
		//Count validation
		/*
		 * List<WebElement> ele =
		 * driver.findElements(By.xpath("//ul[@id='fileList']//li")); if(ele.size()==2)
		 * { System.out.println("All files are uploaded"); } else {
		 * System.out.println("Files not uploaded");
		 * 
		 * }
		 */
		//Text validation
		
		String text1=driver.findElement(By.xpath("(//ul[@id='fileList']//li)[1]")).getText();
		String text2=driver.findElement(By.xpath("(//ul[@id='fileList']//li)[2]")).getText();
		if(text1.equals("Downloads")&& text2.equals("python")) 
		{
			System.out.println("Files names are matching.........");
		}
		else {
			System.out.println("Mismatch in files");
		}
		
	}

}
