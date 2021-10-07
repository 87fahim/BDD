package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectItem(WebElement element, String company) {
		Select sel = new Select(element);
		sel.selectByValue(company);
	}

	public void selectItem(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public int rand(int bound) {
		return new Random().nextInt(bound) + 1;
	}

	public void takeScreenshot() throws IOException {
		TakesScreenshot sc = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MM,dd,yy,HH,mm,ss");
		
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = sc.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));

	}

	public void waitByVisiblity(WebElement element, int second) {
		if (driver == null)
			System.out.println("Driver is Null!!");
		if (element == null)
			System.out.println("Element is null!!");
		WebDriverWait wait = new WebDriverWait(driver, second);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//	@BeforeClass
//	public static void beforeAllTestStart() {
//		configProperty = new ConfigFileReader("config.properties");  
//	}
//
//	@AfterClass
//	public static void afterAllTestsComplete(){
//		 Reporter.loadXMLConfig(new File(configProperty.readProperty("reportConfigPath")));
//		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//		 Reporter.setSystemInfo("OS Name", System.getProperty("os.name"));
//		 Reporter.setSystemInfo("OS Version", System.getProperty("os.version"));
//		 Reporter.setSystemInfo("Application", configProperty.readProperty("ApplicationName"));
//		 Reporter.setSystemInfo("Application", "SourceVu");
//		 Reporter.setSystemInfo("Application Environment", System.getProperty("environmentT"));
//		 Reporter.setSystemInfo("Build number", System.getProperty("jenkins.buildNumber"));
//		 Reporter.setSystemInfo("Browser Type", browser.browserName);
//		 if(driver!=null) 
//			 driver.quit();
//	
//
//	}
}
