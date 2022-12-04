package MystepDefn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/cucumber_first/src/test/resources/Features"},
		glue = {"MystepDefn"},
		plugin = {"pretty"}
		)
public class AmazonRunner {

}
