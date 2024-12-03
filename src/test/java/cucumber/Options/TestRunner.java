package cucumber.Options;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature/",
                   glue= {"StepDefenition"},
                    plugin = {"pretty", "html:target/cucumber-report.html"},
                   publish=true)

public class TestRunner {
 
}