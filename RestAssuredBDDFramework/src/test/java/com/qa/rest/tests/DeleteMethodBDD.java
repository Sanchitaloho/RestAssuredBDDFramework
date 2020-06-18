package com.qa.rest.tests;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class DeleteMethodBDD {
	
	@Test
	public void puttest() {
	
		
		given().
			header("Content-Type","application/json").
			
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).log().all();
			
		
		
		
		
	}
	
	
}
