package com.facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShiftStudent\\eclipse-workspace\\SSMB6-Selenium01\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//finding elements & input user/pass
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arfinpavel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcdefjh");
		
		// TimeUnit
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
				try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		// clicking login button
		//driver.findElement(By.cssSelector("#u_0_2")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

	}

}
