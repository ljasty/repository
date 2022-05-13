package ToolaQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaForm2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]")).click();
		
		WebElement pic=driver.findElement(By.id("uploadPicture"));
		pic.sendKeys(" /Users/lakshmi/Desktop/pract/Screen Shot 2022-05-12 at 1.33.34 PM.png");
		
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(" Hello Ave,tx 95002");
		
		
		Select state=new Select(driver.findElement(By.xpath("//a[@id='close-fixedban']")));
		state.selectByIndex(4);
	}
}
