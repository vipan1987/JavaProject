package qa.framework.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartPageObject extends ObjectBase {
    @FindBy(xpath = "link-to-cart")
    private WebElement cartLink;
    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement continueShoppingLink;
    @FindBy(xpath = "//a[@title='Ruby on Rails Bag']")
    private WebElement railsBagLink;
    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement railsBagQuantity;
    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//button[@id='update-button']")
    private WebElement upDateButtonlink;
    @FindBy(xpath = "//button[@id='checkout-link']")
    private WebElement checkoutButton;

    public WebElement getCart() {
        return cartLink;
    }

    public WebElement getContinueShoppingLink() {
        return continueShoppingLink;
    }

    public WebElement getRailBagLink() {
        return railsBagLink;
    }

    public WebElement getRailsBagQuantity() {
        return railsBagQuantity;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getUpDateLink() {
        return upDateButtonlink;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public CartPageObject(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);

    }
}
