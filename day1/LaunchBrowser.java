package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//initialize the chromedriver
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://www.facebook.com/");
		
		//maximize the window1
		driver.manage().window().maximize();
		
		//enter the email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmailcom");
		
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//click login
		driver.findElement(By.name("login")).click();
		
		//title of current webpage
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
