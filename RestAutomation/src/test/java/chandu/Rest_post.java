package chandu;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_post 
{
	public static void main(String[] args) {
		RestAssured1.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj = new JSONObject();
		obj.put("name","morpheus");
		obj.put("job","leader");
		 req.ContentType(ContentType.JSON);
		 req.body(obj.toJSONString());
		Response res1 = req.request(Method.POST,"/api/users");
		System.out.println(res1.asString());
		System.out.println(res1.getStatusCode());
		System.out.println(res1.getTime());
		System.out.println(res1.getStatusLine());
		System.out.println(res1.getContentType());
	}


}
