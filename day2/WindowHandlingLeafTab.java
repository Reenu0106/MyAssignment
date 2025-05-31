package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingLeafTab {
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
	ChromeDriver driver=new ChromeDriver(options);
	
	//open the url
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//mximize the window
	driver.manage().window().maximize();
	
	//implicit wait for 30sec
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//enter the username
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    
    //enter the password
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //click login button
    driver.findElement(By.className("decorativeSubmit")).click();
    
    //click CRM link
    driver.findElement(By.partialLinkText("CRM")).click();
    
    //click on contacts button
    driver.findElement(By.linkText("Contacts")).click();
    
    //Click on Merge Contacts.
    driver.findElement(By.linkText("Merge Contacts")).click();
    
    //Click on the widget of the "From Contact"
    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
    
    //switch to new window
    Set<String> ChildWindow = driver.getWindowHandles();
    String mainwindow = driver.getWindowHandle();
    List<String> listWindow=new ArrayList<String>(ChildWindow);
    for (int i = 0; i < listWindow.size(); i++) {
    	String Window=listWindow.get(i);
		driver.switchTo().window(Window);
	}
    
    //Click on the first resulting contact.
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();  
    driver.switchTo().window(mainwindow);
    
    //Click on the widget of the "To Contact".
    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click() ;
    
    //switch to new window
    Set<String> childWindow1 = driver.getWindowHandles();
    List<String> ListWindow1=new ArrayList<String>(childWindow1);
    for (int i = 0; i < ListWindow1.size(); i++) {
    	String Window1=ListWindow1.get(i);
        driver.switchTo().window(Window1);
	}
    //Click on the second resulting contact
    driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
    driver.switchTo().window(mainwindow);
    
    //Click on the Merge button.
    driver.findElement(By.className("buttonDangerous")).click();
    
    //Accept the alert.
    Alert alert = driver.switchTo().alert();
    alert.accept();
    
    //Verify the title of the page.
    String title = driver.getTitle();
    System.out.println(title);
    if (title.equals("view Contacts")) {
    	System.out.println("Title is verified");
    }else{
    	System.out.println("Title is not verified");
    }
 }}