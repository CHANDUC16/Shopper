package chandu;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restget1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification res = RestAssured.given();
		Response res1 = res.request(Method.GET,"/api/users?page=2");
		System.out.println(res1.prettyPrint());
	}
}