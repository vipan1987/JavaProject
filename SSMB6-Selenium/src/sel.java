import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class sel {

	public static void main(String [] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShiftStudent\\Desktop\\java programs\\SSMB6-Selenium01\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\drivers\\chromedriver.exe");
		
		WebDriver driver =null;
		
		driver=new ChromeDriver();
		//driver=getDriver();
		driver.get("http://heatclinic.shiftedtech.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
	}
	public static WebDriver getDriver() {
	return new ChromeDriver();
	
	//WebDriver driver = new ChromeDriver();
	
	}
	
}
