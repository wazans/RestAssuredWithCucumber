package RestAssuredTestCases;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostRequestUsingJsonLibraryForJSOnArray {

	public static void main(String[] args) {
		
		JSONArray Address=new JSONArray();
		
		JSONObject PrimaryAddress=new JSONObject();
		PrimaryAddress.put("Street", "StreetTest");
		PrimaryAddress.put("Locality", "LocalityTest");
		PrimaryAddress.put("City", "CityTest");
		
		JSONObject SecondaryAddress=new JSONObject();
		SecondaryAddress.put("Region", "EMEA");
		SecondaryAddress.put("Country", "UK");
		
		Address.put(0, PrimaryAddress);
		Address.put(1, SecondaryAddress);
		
		JSONObject datanew=new JSONObject();
		datanew.put("FirstName", "Rahul");
		datanew.put("LastName1", "Roy");
		datanew.put("Destination1", "Developer");
		datanew.put("id1", "765");
		
		datanew.put("Address", Address);
		
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
