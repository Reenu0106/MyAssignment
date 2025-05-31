package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilePrice {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	//load url
	driver.get("http://www.Amazon.com.be/");
	//maximize the window
    driver.manage().window().maximize();
    //choose english
    driver.findElement(By.partialLinkText("English")).click();
    driver.findElement(By.id("sp-cc-rejectall-link")).click(); 
    //search phones and click
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
    driver.findElement(By.id("nav-search-submit-button")).click();
    //list the price 
    List<WebElement> phones =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    List<Integer> list=new ArrayList<Integer>();
    for (WebElement each : phones) {
    	String text = each.getText().replaceAll("^0-9", "");
    	if (!text.isEmpty()) {
    		list.add(Integer.parseInt(text));
		}
    	System.out.println(text);
    	}
    //sort the list
    	Collections.sort(list);
    	int min = Collections.min(list);
    	System.out.println(min+ "sort list");
		System.out.println(list.size()+ "Size" );
        System.out.println(list.get(0));
    }
}