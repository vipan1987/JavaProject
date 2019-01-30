package qa.framework.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import qa.framework.controllers.ApplicationController;
import qa.framework.utils.StepBase;
import qa.framework.utils.SelenuimUtils;

public class LoginSteps extends StepBase {
    private SelenuimUtils utils = new SelenuimUtils(driver);
    private ApplicationController spree = new ApplicationController(driver);

    @Given("Not a validated user")
    public void not_a_validated_user() {
        driver.manage().deleteAllCookies();
    }

    @When("User browse to the site")
    public void user_browse_to_the_site() {
        driver.navigate().to("http://spree.shiftedtech.com/");
    }

    @Then("Spree home page should display")
    public void spree_home_page_should_display() {
       spree.homePage().verifyHomePageTitle();
    }

    @When("User click login link")
    public void user_click_login_link() {
        spree.homePage().goToLoginPage();
    }

    @Then("Browser display Login page")
    public void browser_display_Login_page() {
        spree.loginPage().verifyLoginPageTitle();
    }

    @When("User enter user email as {string}")
    public void user_enter_user_email_as(String string) {
        spree.loginPage().enterEmail(string);
    }

    @When("User enter password as {string}")
    public void user_enter_password_as(String string) {
        spree.loginPage().enterPassword(string);
    }

    @When("User click login button")
    public void user_click_login_button() {
        spree.loginPage().clickLoginButton();
    }

    @Then("Home page should display")
    public void home_page_should_display() {
        spree.homePage().verifyHomePageTitle();
    }

    @Then("Login success message display")
    public void login_success_message_display() {
        spree.homePage().verifyLoginSuccess();
    }

    @Then("Login fail message display")
    public void login_fail_message_display() { spree.loginPage().verifyLoginFailiur(); }





}
