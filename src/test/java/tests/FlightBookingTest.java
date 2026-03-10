package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.FlightsPage;
import pages.PurchasePage;
import pages.ConfirmationPage;

public class FlightBookingTest extends BaseTest {

	HomePage home;
	FlightsPage flights;
	PurchasePage purchase;
	ConfirmationPage confirmation;

	@BeforeClass
	public void initPages() {

		home = new HomePage(driver);
		flights = new FlightsPage(driver);
		purchase = new PurchasePage(driver);
		confirmation = new ConfirmationPage(driver);
	}

	@Test(priority = 1)
	public void navigateToApplication() throws InterruptedException {

		driver.get("https://blazedemo.com/");
		System.out.println("Application opened");
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void selectDepartureCity() throws InterruptedException {

		home.selectDepartureCity("Boston");
		System.out.println("Departure city selected");
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void selectDestinationCity() throws InterruptedException {

		home.selectDestinationCity("London");
		System.out.println("Destination city selected");
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void clickFindFlights() throws InterruptedException {

		home.clickFindFlights();
		System.out.println("Find Flights clicked");
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public void verifyFlightsList() throws InterruptedException {

		flights.verifyFlightsAvailable();
		System.out.println("Flights list verified");
		Thread.sleep(1000);
	}

	@Test(priority = 6)
	public void chooseFlight() throws InterruptedException {

		flights.chooseFlight();
		System.out.println("Flight selected");
		Thread.sleep(1000);
	}

	@Test(priority = 7)
	public void verifyPurchasePage() throws InterruptedException {

		System.out.println("Purchase page displayed");
		Thread.sleep(1000);
	}

	@Test(priority = 8)
	public void enterPersonalDetails() throws InterruptedException {

		purchase.enterPersonalDetails();
		System.out.println("Personal details entered");
		Thread.sleep(1000);
	}

	@Test(priority = 9)
	public void enterPaymentDetails() throws InterruptedException {

		purchase.enterPaymentDetails();
		System.out.println("Payment details entered");
		Thread.sleep(1000);
	}

	@Test(priority = 10)
	public void purchaseFlight() throws InterruptedException {

		purchase.clickPurchaseFlight();
		System.out.println("Purchase Flight clicked");
		Thread.sleep(1000);
	}

	@Test(priority = 11)
	public void verifyBookingConfirmation() {

		confirmation.verifyBookingSuccess();
		System.out.println("Flight booking completed successfully.");
	}
}