package MystepDefn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/cucumber_first/src/test/resources/Features/registration.feature"},
		glue = {"cucumber_first/src/test/java/MystepDefn/registration.feature"},
		plugin = {"pretty" ,
				"json:target/myreport/report.json",
				"junit:target/myreport/report.xml"},
		publish = true)
public class AmazonRegRunner {
	

}
