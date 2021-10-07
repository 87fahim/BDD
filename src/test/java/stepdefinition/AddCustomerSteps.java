package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import pages.AddCustomerPage;
import util.BrowserFactory;

public class AddCustomerSteps {
	WebDriver driver;
	AddCustomerPage acPage;
	@Before
	public void beforeAddingCustomer() {
		BrowserFactory.init();
		acPage = PageFactory.initElements(driver, AddCustomerPage.class);
		
	}
}
