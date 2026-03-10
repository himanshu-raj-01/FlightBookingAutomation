package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.WebElement;

public class FlightsPage {

    WebDriver driver;

    By flightsTable = By.xpath("//table//tr");
    By chooseFlightBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyFlightsAvailable() {

        List<WebElement> flights = driver.findElements(flightsTable);

        Assert.assertTrue(flights.size() > 1, "Flights are not available");
    }

    public void chooseFlight() {

        driver.findElement(chooseFlightBtn).click();
    }
}