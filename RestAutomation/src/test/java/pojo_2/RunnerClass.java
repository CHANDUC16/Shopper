package pojo_2;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo_1.Data;
import pojo_1.SingleUser;
import pojo_1.Support;

public class RunnerClass {
	public static void main(String[] args) {

		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/unknown/2");
		SingleResoursce s1 = res.as(SingleResoursce.class);
		pojo_2.Data d = s1.getData();
		pojo_2.Support s2 = s1.getSupport();
		System.out.println(d.getId());
		System.out.println(s2.getText());
	}
}
