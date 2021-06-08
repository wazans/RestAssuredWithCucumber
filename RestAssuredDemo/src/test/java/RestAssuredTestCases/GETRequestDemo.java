package RestAssuredTestCases;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETRequestDemo {

	public static void main(String[] args) {
	
		
		/*
		 * Response resp=given(). when() .get("http://localhost:3000/comments"); int
		 * statusCode=resp.getStatusCode(); assertEquals(statusCode,200);
		 * System.out.println(resp.getStatusCode());
		 * //System.out.println(resp.asPrettyString());
		 * System.out.println(resp.asString());
		 */
		
 
		Response resp=given().
				when()
				.get("https://reqres.in/api/users?id=10");
		
		System.out.println(resp.asString());
		String firstname=resp.jsonPath().getString("data.first_name");
		String id=resp.jsonPath().getString("data.id");
		System.out.println("The first name is: " +firstname);
		System.out.println("The id is: " +id);

		 
		 
		
 
        
	}

}
