package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class AddCustomerPage extends BasePage {


	public AddCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-12']/h2")
	WebElement title;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement ADD_CONTACT_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]")
	WebElement FULL_NAME;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY;
	@FindBy(how = How.XPATH, using = "//input[@id=\"email\"]")
	WebElement EMAIL;
	@FindBy(how = How.XPATH, using = "//input[@id=\"phone\"]")
	WebElement PHONE;
	@FindBy(how = How.XPATH, using = "//input[@id=\"address\"]")
	WebElement ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@id=\"city\"]")
	WebElement CITY;
	@FindBy(how = How.XPATH, using = "//input[@id=\"state\"]")
	WebElement STATE_REGION;
	@FindBy(how = How.XPATH, using = "//input[@id=\"zip\"]")
	WebElement ZIP_CODE;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']")
	WebElement TAGS;
	@FindBy(how = How.XPATH, using = "//button[@class='md-btn md-btn-primary waves-effect waves-light']")
	WebElement SAVE;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement CURRENCY;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP;
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
	WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"cpassword\"]")
	WebElement CONFIRM_PASSWORD;
	@FindBy(how = How.XPATH, using = "//div[@class='toggle btn btn-primary btn-sm']")
	WebElement WELCOME_EMAIL;
	public void verifyAddContactPage() {
		Assert.assertEquals(ADD_CONTACT_TITLE.getText(), "Add Contact", "WRONG PAGE!!!!");
	}

	public void enterName(String fullName) {
		FULL_NAME.sendKeys(fullName);
	}

	public void selectCompany(int index) {
		selectItem(COMPANY, index);
	}

	public void selectCompany(String company) {
		selectItem(COMPANY, company);
	}

	public void enterEmail(String email) {
		this.EMAIL.sendKeys(email);
	}

	public void enterPhone(String phone) {
		this.PHONE.sendKeys(phone);
	}
	public void enterAddress(String address) {
		ADDRESS.sendKeys(address);
	}
	
	public void enterCity(String city) {
		CITY.sendKeys(city);
	}
	public void enterState(String state) {
		STATE_REGION.sendKeys(state);
	}
	public void enterZipCode(String zipCode) {
		ZIP_CODE.sendKeys(zipCode);
	}
	public void selectCountry(String country) {
		selectItem(COUNTRY, country);
	}
	public void selectCountry(int index) {
		selectItem(COUNTRY, index);
	}
	public void enterTags(String tags) {
		TAGS.sendKeys(tags);
	}
	public void clickSave() {
		SAVE.click();
	}

	public void selectCurrency(String currency){
		selectItem(CURRENCY, currency);
	}
	public void selectCurrency(int index){
		selectItem(CURRENCY, index);
	}
	
	public void selectGroup(String group) {
		selectItem(GROUP, group);
	}
	public void selectGroup(int index) {
		selectItem(GROUP, index);
	}
	public void enterPassword(String pass) {
		PASSWORD.sendKeys(pass);
	}
	public void confirmPassword(String pass) {
		CONFIRM_PASSWORD.sendKeys(pass);
	}
	public void clickWelcomeMail() {
		WELCOME_EMAIL.click();
	}
	public void verfirDashboardPage() {
		Assert.assertEquals(title.getText(), "Dashboard", "WRONG PAGE!!");
	}

	
}
