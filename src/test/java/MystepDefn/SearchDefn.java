package MystepDefn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchDefn {
	@Given(":  As a registered user when user opens the app")
	public void as_a_registered_user_when_user_opens_the_app() {
	   
		System.out.println("user has an account");
	    
	}

	@Then(":  In search bar user will type the {string}")
	public void in_search_bar_user_will_type_the(String productname) {
	   
		System.out.println(productname);
	    
	}

	@Then(": As a result all the {string} with different {string} should be displayed")
	public void as_a_result_all_the_with_different_should_be_displayed(String productname, String brand) {
	   
		System.out.println(productname+" "+brand);
	    
	}

}
