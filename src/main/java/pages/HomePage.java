package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    By departureCity = By.name("fromPort");
    By destinationCity = By.name("toPort");
    By findFlightsBtn = By.cssSelector("input[type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDepartureCity(String city) {
        Select select = new Select(driver.findElement(departureCity));
        select.selectByVisibleText(city);
    }

    public void selectDestinationCity(String city) {
        Select select = new Select(driver.findElement(destinationCity));
        select.selectByVisibleText(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }
}