package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
	public static void main(String[] args) {
		
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	
	//initialise the chromedriver
	ChromeDriver driver=new ChromeDriver(options);
	
	//load the url
	driver.get("http://leaftaps.com/opentaps/");
	
	//maximise the window
	driver.manage().window().maximize();
	
	//enter the username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	//enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//click CRM link
	driver.findElement(By.partialLinkText("CRM")).click();
	
	//click on lead tab
	driver.findElement(By.linkText("Leads")).click();
	
	//click on crate lead  button
	driver.findElement(By.linkText("Create Lead")).click();
	
	//enter firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reenu3");
	
	//enter lastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
	
	//enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	//enter title
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("App");
	
	//click the create lead button
	driver.findElement(By.className("smallSubmit")).click();
	
	//verify the title displayed
	String title=driver.getTitle();
	System.out.println(title);
	if (title.equals("View Lead | opentaps CRM")) {
		System.out.println("title verified successfully");
		
	}
	
	//close the browser
	driver.close();
  
}
}