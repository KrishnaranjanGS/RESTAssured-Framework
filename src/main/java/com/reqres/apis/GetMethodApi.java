package com.reqres.apis;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import com.reqres.constants.ReqresConstants;
import com.reqres.utils.ReqresConfigReader;

import io.restassured.response.Response;


public class GetMethodApi {

    
	public Response getUsersListMethod() {
		
		return given()
			.header("x-api-key", ReqresConfigReader.get("api.key"))
			.queryParam("page", ReqresConstants.REQUEST_PAGE_NO)
			.log().all()

		
		.when()
			.get("/api/users")
		
		.then()
		.log().all()
		.extract()
		.response();
		
		
	}
	
}
