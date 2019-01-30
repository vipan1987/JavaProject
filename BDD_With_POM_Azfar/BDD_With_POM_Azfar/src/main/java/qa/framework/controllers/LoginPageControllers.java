package qa.framework.controllers;

import org.openqa.selenium.WebDriver;
import qa.framework.objects.LoginPageObject;
import qa.framework.utils.SelenuimUtils;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;


public class LoginPageControllers extends LoginPageObject {
    public LoginPageControllers(WebDriver driver) {
        super(driver);
    }

    SelenuimUtils utils = new SelenuimUtils(driver);

    public void login(String email, String password) {
        getEmailTextBox().sendKeys(email);
        getPasswordTextBox().sendKeys(password);
        getLoginButton().click();
        utils.delayFor(2000);
    }


    public void verifyLoginPageTitle() {

        String title = driver.getTitle();
        assertThat(title, startsWith("Login - Spree Demo Site"));
    }

    public void verifyLoginFailiur() {

        String message = getLoginNotAssertion().getText();
        assertThat(message, startsWith("Invalid email or password"));
    }

    public void goToCreateAccountPage() {
        getCreateAccount().click();
    }

    public void enterEmail(String email){
        getEmailTextBox().clear();
        getEmailTextBox().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordTextBox().clear();
        getPasswordTextBox().sendKeys(password);
    }

    public void clickLoginButton(){
        getLoginButton().click();
    }


}
