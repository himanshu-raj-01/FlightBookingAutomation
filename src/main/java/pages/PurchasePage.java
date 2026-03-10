package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

	WebDriver driver;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.id("inputName");
	By address = By.id("address");
	By city = By.id("city");
	By state = By.id("state");
	By zip = By.id("zipCode");

	By cardType = By.id("cardType");
	By cardNumber = By.id("creditCardNumber");
	By month = By.id("creditCardMonth");
	By year = By.id("creditCardYear");
	By nameOnCard = By.id("nameOnCard");

	By rememberMeCheckbox = By.id("rememberMe");

	By purchaseBtn = By.cssSelector("input[type='submit']");

	public void enterPersonalDetails() {

		driver.findElement(name).sendKeys("Himanshu Raj");
		driver.findElement(address).sendKeys("123 Street");
		driver.findElement(city).sendKeys("Bhubaneswar");
		driver.findElement(state).sendKeys("Odisha");
		driver.findElement(zip).sendKeys("751024");
	}

	public void enterPaymentDetails() {

		Select card = new Select(driver.findElement(cardType));
		card.selectByVisibleText("Visa");

		driver.findElement(cardNumber).sendKeys("1234 5678 9012");
		driver.findElement(month).clear();
		driver.findElement(month).sendKeys("12");

		driver.findElement(year).clear();
		driver.findElement(year).sendKeys("2027");

		driver.findElement(nameOnCard).sendKeys("Himanshu Raj");
		
		driver.findElement(rememberMeCheckbox).click();
	}

	public void clickPurchaseFlight() {
		driver.findElement(purchaseBtn).click();
	}
}