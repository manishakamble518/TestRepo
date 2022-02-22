package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dell\\eclipse-workspace\\Max_of_3_Nos\\src\\com.facebook.features\\A.feature", 
glue= {"C:\\Users\\dell\\eclipse-workspace\\Max_of_3_Nos\\src\\cucumberStepDefinition\\LoginStepDefinition.java"})
public class TestRunner {

}
