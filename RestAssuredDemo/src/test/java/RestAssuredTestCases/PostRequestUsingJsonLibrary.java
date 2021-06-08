package RestAssuredTestCases;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestUsingJsonLibrary {

	public static void main(String[] args) {
		JSONObject datausingjsonlib=new JSONObject();
		//No dependency on another class
		/*
		 *Below put() method is to assign the values.
		Please do not confuse it with PUT Http
		 * request. Both of these are different.
		 */
		datausingjsonlib.put("FirstName1", "WasimNew");
		datausingjsonlib.put("LastName1", "AnsariNew");
		datausingjsonlib.put("Destination1", "SQA");
		datausingjsonlib.put("id1", "987654321");
		Response resp=
				
				given()
				.contentType(ContentType.JSON)
				.body(datausingjsonlib)
				.when()
				.post("http://localhost:3000/friends");
			
			System.out.println("Status code is "+ resp.getStatusCode());
			System.out.println("Data posted is");
			System.out.println(resp.asString());
					

	}

}
