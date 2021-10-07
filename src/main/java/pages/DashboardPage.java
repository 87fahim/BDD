package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-12']/h2")
	WebElement title;
	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CUSTOMERS;
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-second-level collapse in']/li[1]/a")
	WebElement ADD_CUSTOMERS;
	@FindBy(how =How.XPATH, using="//ul[@class='nav nav-second-level collapse in']/li[2]/a") WebElement LIST_CUSTOMERS;
	public String getPageTile() {
		this.waitByVisiblity(title, 5);
		return title.getText();
	}
	public void verfirDashboardPage() {
		this.waitByVisiblity(title, 5);
		Assert.assertEquals(title.getText(), "Dashboard", "WRONG PAGE!!");
	}

	public void clickOnCustomers() {
		CUSTOMERS.click();
	}

	public void clickONAddCustomers() {
		ADD_CUSTOMERS.click();
	}
	
	public void clickOnListCustomers() {
		LIST_CUSTOMERS.click();
	}

}
