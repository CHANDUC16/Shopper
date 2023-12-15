package pojo_3;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RunnerClass 
{
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification Req = RestAssured.given();
	Response res = Req.request(Method.GET,"/api/users?page=2");
	ListUser l = res.as(ListUser.class);
	System.out.println(l.getPage());
	Support s = l.getSupport();
	System.out.println(s.getUrl());
	List<Data> d = l.getData();
	for (Data d1 : d) 
	{
		System.out.println(d1.getFirst_name());
	}
}
}
