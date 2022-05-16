package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrageAndDrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement to=driver.findElement(By.id("draggable"));
		WebElement from=driver.findElement(By.id("droppable"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(to, from).build().perform();
		
	}

}
