package qa.framework.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageObject extends ObjectBase {
    @FindBy(xpath = "//input[@id='spree_user_email']")
    private WebElement emailTextBox;
    @FindBy(xpath = "//input[@id='spree_user_password']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'Create a new account')]")
    private WebElement createAccountLink;
    @FindBy(xpath = "//div[@class='alert alert-error']")
    private WebElement loginFail;


    public  WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCreateAccount() {
        return createAccountLink;
    }


    public WebElement getLoginNotAssertion() {
        return loginFail;
    }


    public LoginPageObject(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);

    }
}
