package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    By confirmationMessage = By.tagName("h1");

    public void verifyBookingSuccess() {

        String message = driver.findElement(confirmationMessage).getText();

        Assert.assertTrue(message.contains("Thank you for your purchase today!"),
                "Booking confirmation not displayed");

    }
}