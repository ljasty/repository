package Omayo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOmayo {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
 driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	WebElement text=driver.findElement(By.id("textbox1"));
	text.clear();
	text.sendKeys("hello");

	JavascriptExecutor js = (JavascriptExecutor)driver; 
	WebElement textbox = driver.findElement(By.id("tb2"));
	//js.executeScript("arguments[0].disabled = true", textbox);
	
	js.executeScript("arguments[0].disabled = false", textbox);
	
	boolean b=textbox.isEnabled();
	System.out.println(b);
	textbox.sendKeys("hai");
	
	/*driver.findElement(By.linkText("Selenium143")).click();
	driver.navigate().back();
	
	Thread.sleep(3000);
	 
	 driver.findElement(By.linkText("SeleniumTutorial")).click();
	 
	 driver.navigate().back();
	 
	 driver.findElement(By.xpath("/button[@id='but2']")).click();  */
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	WebElement butt1=driver.findElement(By.xpath("//button[@id='but1']"));
	js1.executeScript("arguments[0].disabled = false", butt1);
	butt1.click();
	
	WebElement sub=driver.findElement(By.xpath("//button[text()='Submit']"));
			sub.click();
		//	((JavascriptExecutor) driver).executeScript("return arguments[0].click();", sub);
			System.out.println("Submit is clicked");
			
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	System.out.println("Login is clicked");
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	System.out.println("Register is clicked");
	
	
	
	
	
}
}
