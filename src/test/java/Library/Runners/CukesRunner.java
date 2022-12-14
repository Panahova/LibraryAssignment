package Library.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(


            plugin = {
                    "pretty",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun/txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "library.feature",
            glue = "src/test/java/Library/stepDefination",
            dryRun = false,
            tags = ""
    )

    public class CukesRunner {

    }


