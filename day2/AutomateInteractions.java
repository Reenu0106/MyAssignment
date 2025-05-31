package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateInteractions {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-- disable-notifications");
		//opt.addArguments("-- disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt); 
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.className("allcircle circleone")).click();
			
		
		
	}

}
