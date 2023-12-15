package chandu;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_post2 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj = new JSONObject();
		obj.put("email","eve.holt@reqres");
		obj.put("password","pistol");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res1 = req.request(Method.POST,"/api/register");
		System.out.println(res1.asString());
		System.out.println(res1.getStatusCode());
		System.out.println(res1.getTime());
		System.out.println(res1.getStatusLine());
		System.out.println(res1.getContentType());
}
}
