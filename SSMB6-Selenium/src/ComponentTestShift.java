import java.sql.Driver;

import javax.management.openmbean.OpenDataException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComponentTestShift {
	
	@Before
public void setUp() {
	//public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\drivers\\chromedriver.exe");
		WebDriver driver=null;
		
		driver = new ChromeDriver();
		
		driver.navigate().to("http://shifttest.shiftedtech.com/components/text_box");
		driver.manage().window().maximize();
	}
	
	@Test
	public void perform() {
		WebElement element= driver.findElement(By.id("username-text"));
		element.click();
		element.sendKeys("my name is kahan");

	WebElement element2=driver.findElement(By.id("password-text"));
	element2.click();
	element2.sendKeys("open password box");
	
	WebElement element3=driver.findElement(By.id("date"));
		element3.click();
		element3.sendKeys("09231986");
		WebElement element4=driver.findElement(By.id("number" ));
		element4.click();
		element4.sendKeys("2");
		
		//element4.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		//element4.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		WebElement element5=driver.findElement(By.id("areaCode" ));
		element5.click();
		element5.sendKeys("444444444");
		
	}
	@After
	public void tearDown() {
		Driver.close();
		Driver.quit();
		
		
	}	
		
}
