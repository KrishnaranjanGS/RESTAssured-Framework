package com.reqres.apiTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.reqres.apis.GetMethodApi;
import com.reqres.constants.ReqresConstants;

import io.restassured.response.Response;

public class HttpGetMethodsTest {

	GetMethodApi getApi;
	SoftAssert softAssert;
	
	@Test
	public void getMethod() {
		getApi = new GetMethodApi();
		softAssert = new SoftAssert();
		Response apiResponse = getApi.getUsersListMethod();
		softAssert.assertEquals(apiResponse.statusCode(), ReqresConstants.RESPONSE_CODE_SUCCESS);
		softAssert.assertEquals(apiResponse.jsonPath().getInt("page"), ReqresConstants.REQUEST_PAGE_NO);
		softAssert.assertAll();
	}

}
