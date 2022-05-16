package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/dragabble");
		 driver.manage().window().maximize();
	
		 WebElement e=driver.findElement(By.id("dragBox"));
	Actions ac=new Actions(driver); 
	ac.dragAndDropBy(e, 100, 200).build().perform();
	}

}
