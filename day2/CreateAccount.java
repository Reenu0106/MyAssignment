package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
        public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		//initalise the webdriver
		ChromeDriver driver=new ChromeDriver(options);
		
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM
	    driver.findElement(By.partialLinkText("CRM")).click();
	    
		//click account
	    driver.findElement(By.linkText("Accounts")).click();
	    
		//click create account
	    driver.findElement(By.linkText("Create Account")).click();
	    
		//enter account name
	    driver.findElement(By.id("accountName")).sendKeys("Reenu2");
	    
		//enter description as selenium automation tester
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
		//Select "ComputerSoftware" as the industry.
	    WebElement industryDD = driver.findElement(By.name("industryEnumId"));
	    Select select=new Select(industryDD);
	    select.selectByIndex(4);
	    
		//Select "S-Corporation" as ownership using SelectByVisibleText.
	    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    Select select1=new Select(ownershipDD);
	    select1.selectByContainsVisibleText("S-Corporation");
	    
		//Select "Employee" as the source using SelectByValue.
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    Select select2=new Select(sourceDD);
	    select2.selectByValue("LEAD_EMPLOYEE");
	    
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	    WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
	    Select select3=new Select(marketingDD);
	    select3.selectByIndex(6);
	    
		//Select "Texas" as the state/province using SelectByValue.
	    WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select select4=new Select(stateDD);
	    select4.selectByValue("TX");
	    
		//Click the "Create Account" button.
	    driver.findElement(By.className("smallSubmit")).click();
	    
		//Verify that the account name is displayed correctly.
	    String text = driver.findElement(By.xpath("//span[text()='Account Name']//following::span[@class='tabletext']")).getText();
	    System.out.println(text);
	    if (text.contains("Reenu2")) {
	    	System.out.println("accountname verified successfully");
			
		}
	    	
		//Close the browser window.
		driver.close();
	}
        
}


