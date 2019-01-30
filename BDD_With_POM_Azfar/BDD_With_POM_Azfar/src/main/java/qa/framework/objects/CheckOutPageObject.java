package qa.framework.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckOutPageObject extends ObjectBase {
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_firstname']")
    private WebElement firstNameTextbox;
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_lastname']")
    private WebElement lastNameTextbox;
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_address1']")
    private WebElement streetAddressTextbox;
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_city']")
    private WebElement cityTextbox ;
    @FindBy(xpath = "//select[@id='order_bill_address_attributes_country_id']")
    private WebElement countryTextbox;
    @FindBy(xpath = "//select[@id='order_bill_address_attributes_state_id']")
    private WebElement stateTextbox;
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_zipcode']")
    private WebElement zipTextbox;
    @FindBy(xpath = "//input[@id='order_bill_address_attributes_phone']")
    private WebElement phoneTextbox;
    @FindBy(xpath = "//input[@id='order_use_billing']")
    private WebElement checkButtonAddress;
    @FindBy(xpath = "//input[@value='Save and Continue']")
    private WebElement saveContinueButton;


    public WebElement getFirstName() {
        return firstNameTextbox;
    }

    public WebElement getLastName() {
        return lastNameTextbox;
    }

    public WebElement getStreetAddress() {
        return streetAddressTextbox;
    }

    public WebElement getcityName() {
        return cityTextbox;
    }

    public WebElement getCountryName() {
        return countryTextbox;
    }

    public WebElement getStateName() {
        return stateTextbox;
    }

    public WebElement getZipCode() {
        return zipTextbox;
    }

    public WebElement getPhone() {
        return phoneTextbox;
    }

    public WebElement getCheckButton() {
        return checkButtonAddress;
    }

    public WebElement getSaveContinueButton() {
        return saveContinueButton;
    }

    public CheckOutPageObject(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);

    }
}
