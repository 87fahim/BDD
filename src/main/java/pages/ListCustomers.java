package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ListCustomers extends BasePage {

	public ListCustomers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success']")
	WebElement ADD_CUSTOMER;

	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[3]")
	WebElement NAME;

	public void verfiyListCustomerPage() {
		waitByVisiblity(ADD_CUSTOMER, 5);
		Assert.assertEquals(ADD_CUSTOMER.getText(), "Add Customer", "WRON PAGE!!");
	}

	public void verifyIfAdded(String name) {
		String before = "//tbody/tr[";
		String after = "]/td[3]";

		for (int i = 1; i <= 10; i++) {
			String temp = driver.findElement(By.xpath(before + i + after)).getText();

			try {
				Assert.assertEquals(temp, name, "ENTRY HAS FAILED!!");
				System.out.printf("Expected: %s\tFOUND: %s\n", name, temp);
				break;
			} catch (Exception e) {
				System.out.printf("NOT THIS ONE: %s", temp);
			}

		}
	}

	// tbody/tr[1]/td[7]/a[2]/i
	public void deleteCustomerByName(String name) throws InterruptedException {
		String before = "//tbody/tr[";
		String after = "]/td[3]";
		// tbody/tr[1]/td[7]/a[@class='btn btn-danger btn-xs cdelete']

		for (int i = 1; i <= 10; i++) {
			String xpath = before + i + "]/td[7]/a[@class='btn btn-danger btn-xs cdelete']";
			String temp = driver.findElement(By.xpath(before + i + after)).getText();
			if (temp.equals(name)) {
				driver.findElement(By.xpath(xpath)).click();
				driver.findElement(By.xpath("//html/body/div[1]/div/div/div[2]/button[2]")).click();
				//Cancel xpath = // html/body/div[1]/div/div/div[2]/button[1]
			}
		}

	}

}
