package rest_API_Project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class POST_Request {
	
	@Test
	public void Create() {
		RestAssured.baseURI = "https://petstore.swagger.io";
		Response response = given().header("content-type","application/json")
				.log().all()
				.body("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"category\": {\r\n"
						+ "    \"id\": 0,\r\n"
						+ "    \"name\": \"string\"\r\n"
						+ "  },\r\n"
						+ "  \"name\": \"goldie\",\r\n"
						+ "  \"photoUrls\": [\r\n"
						+ "    \"string\"\r\n"
						+ "  ],\r\n"
						+ "  \"tags\": [\r\n"
						+ "    {\r\n"
						+ "      \"id\": 0,\r\n"
						+ "      \"name\": \"string\"\r\n"
						+ "    }\r\n"
						+ "  ],\r\n"
						+ "  \"status\": \"sold\"\r\n"
						+ "}")
				.when().post("/v2/pet").then().statusCode(200)
				.log().body()
				.extract().response();
		System.out.println(response.asPrettyString());
	}

}
