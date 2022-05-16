package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDrown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		 driver.manage().window().maximize();
		// Select s=new Select(driver.findElement(By.xpath("//div[text()='Select Option']")))
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")));
		 Thread.sleep(3000);
		s.selectByIndex(1);
		
		
		 Select s1 = new Select(driver.findElement(By.id("oldSelectMenu")));
		 s1.selectByIndex(1);
	}

}

