package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://www.facebook.com/?ref=tn_tnmn");
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Decline optional cookies']")).click();
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("reenu");
		
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("priya");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("9954623152");
		
		//Enter the New password.
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[7]")).sendKeys("123");
		
		//Handle all three dropdowns in Date of birth
		WebElement month = driver.findElement(By.id("month"));
		Select select1=new Select(month);
		select1.selectByIndex(0);
		
		//date
		WebElement date = driver.findElement(By.id("day"));
		Select select2=new Select(date);
		select2.selectByIndex(21);
		
		//year
		WebElement year = driver.findElement(By.id("year"));
		Select select3=new Select(year);
		select3.selectByValue("1993");
		
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
    }

}
