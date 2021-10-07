package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;
	boolean valid;

	@Given("^User in on the login page$")
	public void User_in_on_the_login_page() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@When("^User enters username as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_as_and_and(String username, String password, String valid) {
		this.valid = valid.equals("true");
		loginPage.enterUserName(username);
		loginPage.enterPass(password);
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() {
		loginPage.clickSignIn();
	}

	@Then("^User should be on Dashboard page$")
	public void user_should_be_on_Dashboard_page() throws IOException {
		loginPage.takeScreenshot();
		if (this.valid)
			Assert.assertEquals(driver.getTitle(), "Dashboard- iBilling", "WRONG PAGE!!");
		else
			Assert.assertEquals(driver.getTitle(), "Login - iBilling", "WRONG PAGE!!");
		BrowserFactory.endSession();
	}
	
	
}
