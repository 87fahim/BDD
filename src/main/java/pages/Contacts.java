package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Contacts extends BasePage{

	public Contacts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how =How.XPATH, using="//a[@id=\"summary\"]") WebElement SUMMARY;
	public void verifyContactsPage() {
		waitByVisiblity(SUMMARY, 5);
		Assert.assertEquals(SUMMARY.getText(), "Summary", "WRONG PAGE!!");
	}
	
}
