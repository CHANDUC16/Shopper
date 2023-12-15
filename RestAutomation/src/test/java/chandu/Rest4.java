package chandu;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest4 
{
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res1 = req.request(Method.GET,"/api/users/");
		System.out.println(res1.asString());
		System.out.println(res1.getStatusCode());
		System.out.println(res1.getTime());
		System.out.println(res1.getStatusLine());
		System.out.println(res1.getContentType());
	}

}
