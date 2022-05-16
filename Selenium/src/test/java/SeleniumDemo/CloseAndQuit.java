package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuit {
	public static void main(String[] args) {
  
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.findElement(By.linkText("SeleniumTutorial")).click();
		driver.quit();
		

	}

}
