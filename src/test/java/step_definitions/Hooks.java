package step_definitions;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.IOException;

public class Hooks {
    public static AndroidDriver androidDriver;
    private final TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void openBrowser() throws IOException {
        AndroidDriverInstance androidDriverInstance = new AndroidDriverInstance();
        androidDriver = androidDriverInstance.initialize();
        context.androidDriver = androidDriver;
    }

    @After
    public void closeBrowser(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES),
                "image/png", "Emulator-test");
        androidDriver.quit();
    }
}
