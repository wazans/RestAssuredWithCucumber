package RestAssuredTestCases;

import static io.restassured.RestAssured.given;



import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseDataParsing1 {

	public static void main(String[] args) {

		Response resp=
				
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/cars");
		
		String namefromjson=resp.jsonPath().getString("Ford.model");
		System.out.println(namefromjson);
			

	}

}
