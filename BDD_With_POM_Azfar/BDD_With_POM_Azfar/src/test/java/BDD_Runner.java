import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // tags = { " @Aceptance " },
        // tags = { "@debug" },
        // tags = { "@smoke" }, /* smoke test only */
        // tags = { "@smoke,@debug" }, /* debug or smoke test */
        // tags = { "@smoke","@debug" }, /* debug and smoke test */

        //dryRun = true,
        monochrome = true,

        features = {"src/test/java/resources/features/Login.feature"},

        glue = { "qa.framework.steps",
                "qa.framework.hook" }
        ,

        plugin = { "pretty:target/cucumber-test-report/cucumber-pretty.txt", "html:target/cucumber-test-report",

                    "junit:target/cucumber-test-report/test-report.xml", "json:target/cucumber-test-report/cucumber.json"})

public class BDD_Runner {
}
