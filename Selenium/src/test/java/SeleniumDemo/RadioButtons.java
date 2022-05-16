package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement radio=driver.findElement(By.xpath("//label[text()='Yes']"));
	radio.click();
	
	
	
		
		boolean b=radio.isEnabled();
		System.out.println("radio button is enabled" +b);
		
		boolean c=radio.isDisplayed();
		System.out.println("radio button is displayed" +c);
		
		boolean d=radio.isSelected();
		System.out.println("radio button is Selected" +d);
		
		
		
	}

}
