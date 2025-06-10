package Ranner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "Steps"
       // tags="@Smoke",
//        plugin = {"pretty",
//                "html:target/cucumber-reports/html"
//                , "json:target/cucumber-reports/report.json"
//                , "junit:target/cucumber-reports/report.xml",
//        },
//        dryRun = false,
//        monochrome = true;
)

public class runner {
}
