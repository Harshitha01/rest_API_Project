package rest_API_Project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class POST_Request {
	
	@Test
	public void Create() {
		RestAssured.baseURI = "https://petstore.swagger.io";
		Response response = given().
	}

}
