package ToolaQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaForm {
	
	public static void main(String[] args) throws InterruptedException {

		//https://github.com/ljasty/Selenium-Toolsqa-form.git
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("abcd");
		driver.findElement(By.id("lastName")).sendKeys("hello");
		driver.findElement(By.id("userEmail")).sendKeys	("abc@gmail.com");
		
		
	WebElement RadioGender=driver.findElement(By.xpath("//label[text()='Female']"));
	RadioGender.click();
	
	driver.findElement(By.id("userNumber")).sendKeys("1234657889");
	
	driver.findElement(By.id("dateOfBirthInput")).click();
	Select month=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	month.selectByIndex(7);
	//month.selectByValue("7");
	
	Select year=new Select(driver.findElement(By.xpath(" //select[@class='react-datepicker__year-select']")));
	year.selectByValue("1990");
	
	driver.findElement(By.xpath("//*[@aria-label='Choose Sunday, August 12th, 1990']")).click();  
	
		//driver.findElement(By.xpath("//label[text()='Sports']")).click();
		//driver.findElement(By.xpath("///label[text()='Reading']]")).click();
		
		//driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click(); 
         // Thread.sleep(3000);
		//driver.findElement(By.xpath("//label[text()='Sports']")).click();
		//driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		//driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]")).click();
		
	//WebElement sub=driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
	//sub.click();
	//sub.sendKeys("math");
	//div[@class='subjects-auto-complete__control css-yk16xz-control']
	
	//div[@class='subjects-auto-complete__input']
  
	
	
	driver.quit();
	}

}
