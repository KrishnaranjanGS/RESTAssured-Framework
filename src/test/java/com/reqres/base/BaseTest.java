package com.reqres.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.reqres.utils.ReqresConfigReader;

import io.restassured.RestAssured;

public class BaseTest {

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = ReqresConfigReader.get("base.uri");
	}
	
	@AfterClass
	public void tearDown() {
	    RestAssured.reset();
	}
}
