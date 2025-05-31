package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBag {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.ajio.com/");
		//maximize the window
		driver.manage().window().maximize();
		//type bag and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bag", Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.className("facet-linkname facet-linkname-genderfilter facet-linkname-Men")).click();
		//Under "Category" click "Fashion Bags"
		//Print the count of the items found. 
		//Get the list of brand of the products displayed in the page and print the list.
		//Get the list of names of the bags and print it
		
		
	
	}
}
