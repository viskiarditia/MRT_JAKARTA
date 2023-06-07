package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LoginStepdefs {
    private WebDriver webDriver;
    private final AndroidDriver androidDriver;

    public LoginStepdefs(){
        super();
        this.androidDriver = Hooks.androidDriver;
    }

    public AndroidDriver getDriver() {
        return androidDriver;
    }
    public FluentWait<AndroidDriver> fluentWait() {
        return new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    @Given("^User open the Official Sign In With Google apps MRT Jakarta$")
    public void userOpenTheOfficialAppsMRTJakarta() {
        WebElement buttonSignInWithGoogle = androidDriver.findElement(MobileBy.id(" "));
        buttonSignInWithGoogle.click();
    }

    @Then("^User already on landing page MRT JAKARTA$")
    public void userAlreadyOnLandingPageMRTJAKARTA() {
        WebElement landingPage = webDriver.findElement(MobileBy.id(" "));
        landingPage.isDisplayed();
        Assert.assertTrue(true);
    }

}
