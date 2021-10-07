package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//This should come from JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
			//Address of features file.
			//1. It can be the exact path to one feature file like: ".\\src\\test\\java\\features\\Login.feature"
			//2. Or, this "classpath:features" to run all feature files. This will run all feature files inside the features package
			features = "classpath:features",
			
			//Address (package) of step definition class
			glue = "stepdefinition",   
			
			//Name of the tag to run from feature file
			tags = "@Login",
			
			//
			monochrome = true,
			
			//This is used for compilation of the Step Definition 
			//and Feature files and to verify the compilation errors.
			//If it is false, it only compile the Step Definition and Feature files to check for error
			//If it is true, it will run the test in the browser
			dryRun = false,
			
			//Which plug-in to use
			plugin = {
					"pretty",
					"com.cucumber.listener.ExtentCucumberFormatter:target/Test-Report/TestResult.html",
					//"html:target/test_result_html",     		//Save the result as html in target path, the file name will be index.html
					"json:target/test_result_json/TestResult.json"	//Save the result as json file in target path
			}
		
		)
public class Runner {}
