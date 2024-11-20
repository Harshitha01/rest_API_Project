package rest_API_Project;

import static io.restassured.RestAssured.given;

//import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Request {
	
	@Test
	public void FindPets() {
		RestAssured.baseURI = "https://petstore.swagger.io" ;
		
		Response response = given()
				.queryParam("status","sold")
				.log().all()
				.when()
				.get("/v2/pet/findByStatus").then().statusCode(200)
				.log().body()
				.extract().response();
		int statusCode = response.getStatusCode();
		 System.out.println("Status code is : " +statusCode); 
		 /*if(statusCode == 200) {
		 * List <Object> PetsList = response.jsonPath().getList(""); 
		 * for(Object Pet:
		 * PetsList) { System.out.println("Pets : " + Pet.toString()); } }
		 */
	}

}
