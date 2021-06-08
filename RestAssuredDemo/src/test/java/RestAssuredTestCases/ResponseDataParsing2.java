package RestAssuredTestCases;

import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseDataParsing2 {

	public static void main(String[] args) {
			Response resp=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://dummy.restapiexample.com/api/v1/employees");
		
			String namefromjson=resp.jsonPath().getString("employee_salary");
			System.out.println(namefromjson);
	}

}
