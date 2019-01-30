package com.shiftedtech.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		//dryRun = true,
		
        tags = { "@Aceptance" }, /* Acceptance test only */
        //tags = { "@Aceptance,@Functional" }, /* Acceptance OR Functional test */
        //tags = { "@Aceptance","@Functional" },  /* Acceptance AND Functional test */
		
		features = "src/test/resources/features/SpreeLoginFunctionality.feature",
        //features = "src/test/resources/features/",
        //features = {"src/test/resources/features/SpreeLogin.feature",
        //            "src/test/resources/features/SpreeLogin2.feature"},
        
        glue = {"com.shiftedtech.spree.framework.steps"},
        
        plugin={
                //"pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        	   }
	)
public class BDDRunner {

}
