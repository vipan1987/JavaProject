package qa.framework.controllers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import qa.framework.objects.HomePageObject;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public class HomePageController extends HomePageObject {
    public HomePageController(WebDriver driver) {
        super(driver);
    }


    public void goToLoginPage() {
        getLoginPage().click();
    }

    public void departmentBox() {
        Select s = new Select(getDepartmentBox());
        s.selectByVisibleText("Brand");

    }

    public void goToBagsPage() {
        getBags().click();

    }

    public void goToMugsPage() {
        getMugs().click();

    }

    public void goToClothingPage() {
        getClothing().click();

    }

    public void goToRubyPage() {
        getRuby().click();

    }

    public void goToApachePage() {
        getApache().click();

    }

    public void goToSpreePage() {
        getSpree().click();

    }

    public void goToRailsPage() {
        getRails().click();

    }
    public void verifyLoginSuccess() {
        WebElement alertMsg = successMessage();
        String mString = alertMsg.getText();
        Assert.assertEquals("Logged in successfully", mString);
    }

    public void verifyLogoutSuccess() {
        WebElement alertMsg = getLogoutSuccessMsg();
        String mString = alertMsg.getText();
        Assert.assertEquals("Signed out successfully.", mString);
    }


    public void verifyHomePageTitle() {

        String title = driver.getTitle();
        assertThat(title, startsWith("Spree Demo Site"));
    }


    public void brokenLinks() {
        List<WebElement> totalLinks = getHomePageLinks();

        List<String> activeLinks = new ArrayList<>();

        for (int i = 0; i < totalLinks.size(); i++) {
            if (totalLinks.get(i).getAttribute("href") != null) {
                activeLinks.add(totalLinks.get(i).getAttribute("href"));
            }
        }
        System.out.println("total number of active links are ----->" + activeLinks.size());

        int count = 1;
        for (int j = 0; j < activeLinks.size(); j++) {
            String url = activeLinks.get(j);
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j)).openConnection();
                connection.connect();
                String massage = connection.getResponseMessage();
                connection.disconnect();
                System.out.println(count + "--->" + url + "----->" + massage);
                count++;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
