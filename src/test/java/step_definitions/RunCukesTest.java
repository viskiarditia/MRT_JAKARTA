package step_definitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        monochrome = true,
        tags = "@Login",
        features = {"src/test/resources"},
        glue = {"steps","hooks"},
        plugin= {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber/cucumber.json,",
                "junit:target/cucumber-report/cucumber.xml",
                "message:target/cucumber-report/cucumber.ndjson",
                "html:target/result.html",
                "me.jvt.cucumber.report.PrettyReports:report"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RunCukesTest extends AbstractTestNGCucumberTests {
}