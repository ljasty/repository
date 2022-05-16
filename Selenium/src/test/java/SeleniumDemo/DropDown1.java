package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
	Select s=new Select(driver.findElement(By.id("drop1")));
		//s.selectByIndex(1);
		
		s.selectByVisibleText("doc 3");
		   
		
		Select s1=new Select(driver.findElement(By.id("multiselect1")));
		s1.selectByIndex(2);
		
		
	}

}
