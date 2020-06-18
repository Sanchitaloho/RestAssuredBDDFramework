package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetCallBDD {

	
	@Test
	public void test_2017() {
		given().
		when().
		get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().
		statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
		and().
		header("content-length", equalTo("4551"));
	}
	@Test
	public void gettest_BDD() {
		
		
		given().
		header("Content-Type","application/json").
		get("https://reqres.in/api/users?page=2").
		then().
		body("data.id[1]", equalTo(8)).and().
		body("data.first_name", hasItems("Lindsay","Tobias"));
	//	then().log().all();
		
		
	}
}
