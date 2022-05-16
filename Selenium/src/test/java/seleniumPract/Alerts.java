package seleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
	/*	driver.findElement(By.id("alertButton")).click();
		
		Alert simplealert=driver.switchTo().alert();
		simplealert.accept();  */
		
	/*	driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert timealert=driver.switchTo().alert();
		Thread.sleep(5000);
		timealert.accept();  */
		
	/*	driver.findElement(By.id("confirmButton")).click();
		Alert conformalert=driver.switchTo().alert();
		System.out.println(conformalert.getText());
		conformalert.accept(); */
		
		driver.findElement(By.id("promtButton")).click();
		Alert promtalert=driver.switchTo().alert();
		promtalert.sendKeys("hello");
		promtalert.getText();
		promtalert.accept();
		
		
	}

}
