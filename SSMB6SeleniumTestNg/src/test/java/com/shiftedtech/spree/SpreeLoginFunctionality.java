package com.shiftedtech.spree;

import framework.ScriptBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by PaxoStudent on 1/26/2019.
 */
public class SpreeLoginFunctionality extends ScriptBase {



    @Test
    public void test1(){
        spree().homePage().goToLoginPage();
        spree().loginPage().verifyPageTitle();
        spree().loginPage().login("shiftqa01@gmail.com","shiftedtech");
        spree().homePage().verifyPageTitle();
        spree().homePage().verifySuccessMsg();
    }

    @Test
    public void test2(){
        spree().homePage().goToLoginPage();
        spree().loginPage().verifyPageTitle();
        spree().loginPage().login("shiftqa01xxx@gmail.com","shiftedtech");
        spree().loginPage().verifyErrorMsg("Invalid .*");

    }

    @Test
    public void test3(){
        spree().homePage().goToLoginPage();
        spree().loginPage().verifyPageTitle();
        spree().loginPage().login("shiftqa01@gmail.com","shiftedtechxxx");
        spree().loginPage().verifyErrorMsg("Invalid .*");

    }



}
