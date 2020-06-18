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

public class PostMethod {
	
	@Test
	public void posttest_2017() {
		
		/*Map<String, Object> map= new HashMap<String, Object>();
		map.put("name", "Sanchita");
		map.put("job", "Software"); */
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		
		JSONObject request= new JSONObject();
		request.put("name", "Sanchita");
		request.put("job", "Software");
		
		System.out.println(request.toJSONString());
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
			
		
		
		
		
	}
	
	
}
