package es.cfuentes.code.test.kcomp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	@Given("a integer array {string} and a given {int}")
	public void a_integer_array_and_a_given(String stringIntArray, int k) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(stringIntArray);
		System.out.println(k);
	    throw new cucumber.api.PendingException();
	}

	@When("I invoke k-complementary checker")
	public void i_invoke_k_complementary_checker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I get k-complementary tuples {string}")
	public void i_get_k_complementary_tuples(String stringPairArray) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(stringPairArray);
	    throw new cucumber.api.PendingException();
	}

}
