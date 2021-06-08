package RestAssuredTestCases;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestUsingJsonLibraryForComplexJSON {

	public static void main(String[] args) {
		JSONObject Adress=new JSONObject();
		Adress.put("Locality", "SB Loc");
		Adress.put("city", "London");
		Adress.put("Country", "UK");
		
		JSONObject datanew=new JSONObject();
		datanew.put("FirstName1", "A");
		datanew.put("LastName1", "Complex");
		datanew.put("Destination1", "JSON");
		datanew.put("id1", "%^&$@!#@#");
		
		datanew.put("Address", Adress);
		
		Response resp=
				
				given()
				.contentType(ContentType.JSON)
				.body(datanew)
				.when()
				.post("http://localhost:3000/friends");
			
			System.out.println("Status code is "+ resp.getStatusCode());
			System.out.println("Data posted is");
			System.out.println(resp.asString());
		

	}

}
