package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//1.lunching website
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
/*		//2.getting title
		String title=driver.getTitle();
		System.out.println(title);
		String actualTitle="Google";
		if(title.equals(actualTitle))
		{
			System.out.println("we opened actual title page");
		}
		else
		{
			System.out.println("we didn't opened actual title page");
		
	}
      //3.getting page current url
		
		System.out.println(driver.getCurrentUrl());
		
		//4. get page source code
		
		System.out.println(driver.getPageSource());
		
		//5.Quit
		driver.quit();
		
		//6.close
		driver.close();  */
 
}
}