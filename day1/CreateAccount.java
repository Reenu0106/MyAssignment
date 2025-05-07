package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
	//initialise the chromedriver
	ChromeDriver driver=new ChromeDriver(options);
	
	//load the url
    driver.get("http://leaftaps.com/opentaps/");
    
    //maximize the window
    driver.manage().window().maximize();
    
    //enter the username
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    
    //enter the password
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //click login button
    driver.findElement(By.className("decorativeSubmit")).click();
    
    //click CRM link
    driver.findElement(By.partialLinkText("CRM")).click();
    
    //click on accounts tab
    driver.findElement(By.linkText("Accounts")).click();
    
    //click on create account button
    driver.findElement(By.linkText("Create Account")).click();
    
    //enter an account name
    driver.findElement(By.id("accountName")).sendKeys("Reenu4");
    
    //enter a description as Selenium Automation Tester
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    
    //enter the no. of employees
    driver.findElement(By.id("numberEmployees")).sendKeys("1");
    
    //enter a site name as "LeafTaps"
    driver.findElement(By.id("officeSiteName")).sendKeys("SN");
    
    //click the "Create Account "button
    driver.findElement(By.className("smallSubmit")).click();
    
    //verify the title is displayed correctly
    String title=driver.getTitle();
     System.out.println(title);
     if (title.equals("Create Account | opentaps CRM")) {
		System.out.println("title verified successfully");
	}
     
    //close the browser window
    driver.close();
	}

}