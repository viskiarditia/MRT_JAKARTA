package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        tags = {"@Login"},
        features = {"src/test/resources"},
        glue = {"steps", "hooks"},
        plugin= {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber/cucumber.json,",
                "junit:target/cucumber-report/cucumber.xml",
                "message:target/cucumber-report/cucumber.ndjson",
                "html:target/result.html",
                "me.jvt.cucumber.report.PrettyReports:report"}
//        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RunCukesTest {
}