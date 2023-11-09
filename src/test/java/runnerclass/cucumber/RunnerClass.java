package runnerclass.cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObjectModules.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featurefile\\cucumber\\facebookfile.feature", glue = "stepdefinition.cucumber")

public class RunnerClass extends Baseclass {
	
	public static WebDriver test;
	
	
	@BeforeClass
	public static  void setup() {
		
		test = launchbrower("chrome");

	}
	
	

}
