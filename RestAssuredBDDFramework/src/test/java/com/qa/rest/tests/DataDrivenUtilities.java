package com.qa.rest.tests;


import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class DataDrivenUtilities {
	
	@DataProvider(name="postingdata")
	public Object[][] dataforpost() {
		
		return new Object[][] {
			{"Graham", "Bell","gbell@gmail.com"},
			{"Henry", "Ford","fordhl@gmail.com"}
		};
		
		
	}
	@DataProvider(name="deletedata")
	public Object[] datafordelete() {
		
		return new Object[] {
			13,14,15,16
		};
		
		
	}
	
	

}
