package es.cfuentes.code.test.kcomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import com.google.gson.Gson;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	private Gson gson = new Gson();
	private int[] initArray;
	private int k;
	private int[][] result;

	@Given("a integer array {string} and a given k {int}")
	public void a_integer_array_and_a_given_k(String stringIntArray, int k) {
	    // Assign k
		this.k = k;
		// Parse and assign initial int array
		this.initArray = gson.fromJson(stringIntArray, int[].class);
		
	}

	@When("I invoke k-complementary checker")
	public void i_invoke_k_complementary_checker() {
	    
		// Invoke method to test and get results
		result = KComplementaryChecker.check(initArray, k);
	}

	@Then("I get k-complementary tuples {string}")
	public void i_get_k_complementary_tuples(String stringPairArray) {
		
		final int[][] expectedTuples = gson.fromJson(stringPairArray, int[][].class);
		
		// We check that the size of arrays are the same
		assertEquals(expectedTuples.length, result.length);
				
		// We check that every element in result is contained in expected tuples
		Arrays.stream(result).forEach(res ->
			assertTrue(Arrays.stream(expectedTuples).anyMatch(exp -> 
				res[0] == exp[0] && res[1] == exp[1]
			))
		);
	}

}
