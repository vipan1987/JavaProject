package qa.framework.hook;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import qa.framework.utils.StepBase;

public class BDD_hook extends StepBase {



    @Before
    public void setUp() {
        ChromeDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("http://spree.shiftedtech.com/");


    }
    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}