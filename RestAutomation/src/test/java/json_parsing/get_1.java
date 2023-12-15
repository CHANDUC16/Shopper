package json_parsing;

import io.restassured.RestAssured;

import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_1 
{
public static void main(String[] args) 
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification res = RestAssured.given();
	Response res1 = res.request(Method.GET,"/api/users?page=2");
	String res2 = res1.asString();
	JsonPath jp = new JsonPath(res2);
	String s1 = jp.get("data[1].first_name");
	System.out.println(s1);
}	
}

