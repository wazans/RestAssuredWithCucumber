package Steps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTFeatureSteps {
	@Given("I have valid URL for post request")
	public void i_have_valid_URL_for_post_request() {
	   
	}

	@Then("I should receive status code as 201 ")
	public void i_should_receive_status_code_as(Integer int1) throws FileNotFoundException {
		POSTReq.MyPOSTReq();
		POSTReq pr=new POSTReq();
		
		
		
			
	}

	@Then("Verify the id generated is correct")
	public void verify_the_id_generated_is_correct() throws FileNotFoundException {
		POSTReq.MyPOSTReq();
	}

	@Then("Verify the Response Schema")
	public void verify_the_Response_Schema() throws FileNotFoundException {
		POSTReq.MyPOSTReq();
	}


}
