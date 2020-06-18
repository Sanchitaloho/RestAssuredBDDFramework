package com.qa.rest.tests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.rest.utils.exceldatafetch;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class DataDrivenApi extends DataDrivenUtilities{
	
	
	
//	public static void main(String[] args) {
//		String excelpath="./src/main/java/com/qa/rest/testdata/TestdataforrRestassured.xlsx";
//		String sheetname="Sheet1";
//		
//		exceldatafetch excel=new exceldatafetch(excelpath, sheetname);
//		excel.getcellData(1, 0);
//		excel.getcellData(1, 1);
//		excel.getcellData(1, 2);
//	}
	
	@Test(dataProvider="postingdata")
	public void posttest_2017(String first_name, String last_name, String email) {
		
		
		JSONObject request= new JSONObject();
		request.put("firstname", first_name);
		request.put("lastname", last_name);
		request.put("emailid", email);
		
		baseURI= "http://localhost:3000/";
		
		
		System.out.println(request.toJSONString());
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201);
			
		
	}
	
	@Test(dataProvider="deletedata")
	@Parameters("userID")
	//@Test
	public void deletetest(int userID) {
	
		baseURI= "http://localhost:3000/";
		given().
			header("Content-Type","application/json").
			
		when().
			delete("/users/"+ userID).
		then().
			statusCode(200);
			
		
		
		
	}

}
