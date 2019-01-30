package qa.framework.controllers;


import org.openqa.selenium.WebDriver;

public class ApplicationController {

    private WebDriver driver = null;
    private HomePageController homePage;
    private LoginPageControllers loginPage;

    public ApplicationController(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageController homePage() {
        if (homePage == null) {
            homePage = new HomePageController(driver);
        }
        return homePage;
    }

    public LoginPageControllers loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPageControllers(driver);
        }
        return loginPage;
    }

}

