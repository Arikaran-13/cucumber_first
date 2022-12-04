package MystepDefn;

import java.util.List;
import java.util.Map;

import org.junit.Before;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationDefn {
	
	@BeforeStep(order=1)
	public void init()
	{
		System.out.println("Before step");
	}
	@BeforeStep(order=2)
	public void endStep()
	{
		System.out.println("After steo");
	}
	@Before()
	public void initBeforeScenario()
	{
		System.out.println("Before");
	}
	@After
	public void initAfterScenario()
	{
		System.out.println("After");
	}
	@Given("user visits the App")
	public void GivenMethod() {
		System.out.println("User visits the website");
	}
	@Then("user enters following details")
	public void ThenMethod(DataTable table) {
		System.out.println("User enters following details");
		List<String> list = table.asList();
		System.out.println(list);
	}
	@Then("user registration successfull")
	public void ThenMethod() {
		System.out.println("Reg successfull");
	}
	@Then("Following info entered by user")
	public void Following_info_entered_by_user_asMap(DataTable table) {
		
		List<Map<String,String>> userdata =   table.asMaps(String.class,String.class);
		System.out.println(userdata);
		
	}

}
