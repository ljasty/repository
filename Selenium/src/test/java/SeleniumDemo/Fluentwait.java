package SeleniumDemo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		
	
				
			/*	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			     		.withTimeout(30, TimeUnit.SECONDS) 			
						.pollingEvery(5, TimeUnit.SECONDS) 			
						.ignoring(NoSuchElementException.class);  */
		
	}

}
