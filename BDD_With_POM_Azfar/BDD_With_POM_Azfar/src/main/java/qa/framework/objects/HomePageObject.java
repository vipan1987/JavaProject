package qa.framework.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class HomePageObject extends ObjectBase {
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    private WebElement loginLink;
    @FindBy(xpath = "//select[@id='taxon']")
    private WebElement allDepertmentLink;
    @FindBy(xpath = "//a[contains(text(),'Bags')]")
    private WebElement bagsLink;
    @FindBy(xpath = "//a[contains(text(),'Mugs')]")
    private WebElement mugsLink;
    @FindBy(xpath = "//a[contains(text(),'Clothing')]")
    private WebElement clothingLink;
    @FindBy(xpath = "//a[@class='list-group-item'][contains(text(),'Ruby')]")
    private WebElement rubyLink;
    @FindBy(xpath = "//a[@class='list-group-item'][contains(text(),'Apache')]")
    private WebElement apacheLink;
    @FindBy(xpath = "//a[@class='list-group-item'][contains(text(),'Spree')]")
    private WebElement spreeLink;
    @FindBy(xpath = "//a[@class='list-group-item'][contains(text(),'Rails')]")
    private WebElement railsLink;
    @FindBy(tagName = "a")
    private List<WebElement> homePageLinks;
    @FindBy(css = ".alert-success")
    private WebElement alertMsg;
    @FindBy (xpath = "//div[@class='alert alert-notice']")
    private WebElement logoutSuccessMsg;

    public WebElement getLogoutSuccessMsg() { return logoutSuccessMsg; }

    public List<WebElement> getHomePageLinks() { return homePageLinks; }

    public WebElement getLoginPage() {
        return loginLink;
    }

    public WebElement getDepartmentBox() { return allDepertmentLink; }

    public WebElement getBags() {
        return bagsLink;
    }

    public WebElement getMugs() {
        return mugsLink;
    }

    public WebElement getClothing() { return clothingLink; }

    public WebElement getRuby() {
        return rubyLink;
    }

    public WebElement getApache() {
        return apacheLink;
    }

    public WebElement getSpree() {
        return spreeLink;
    }

    public WebElement getRails() {
        return railsLink;
    }

    public WebElement successMessage() { return alertMsg; }


    public HomePageObject(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
    }
}
