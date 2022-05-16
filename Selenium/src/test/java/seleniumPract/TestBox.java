package seleniumPract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBox {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("userName")).sendKeys("Hello");
	//driver.findElement(By.xpath("//label[@id='userEmail']")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
	//driver.findElement(By.xpath("//label[@id='currentAddress']")).sendKeys("abc ave,tx, 97501");
	driver.findElement(By.id("currentAddress")).sendKeys("abc ave,tx, 97501");
	//driver.findElement(By.cssSelector("label[id='permanentAddress']")).sendKeys("123 ave,tx,75002 ");
	driver.findElement(By.id("permanentAddress")).sendKeys("123 ave,tx,75002 ");
	
	//driver.findElement(By.name("Submit")).submit();
	driver.findElement(By.id("submit")).submit();
	
	
	
}

}
