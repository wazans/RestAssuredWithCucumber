package RestAssuredTestCases;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class PostRequestUsingPOJO {
	public static void main(String[] args) {
		POJOPostRequest Data=new POJOPostRequest();
		Data.setFirstName("Wasim");
		Data.setLastName("Ansari");
		Data.setDestination("QA");
		Data.setId("123");
	
		
		Response resp=
				
			given()
			.contentType(ContentType.JSON)
			.body(Data)
			.when()
			.post("http://localhost:3000/friends");
		
		System.out.println("Status code is "+ resp.getStatusCode());
		System.out.println("Data posted is");
		System.out.println(resp.asString());
				
		
	}
}
