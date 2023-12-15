package pojo_1;

import static org.junit.Assert.assertThat;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Rest1 
{
public static void main(String[] args) 
{
	RequestSpecBuilder req_bui = new RequestSpecBuilder();
	RequestSpecification req = (RequestSpecification) req_bui.setBaseUri("https://reqres.in/");
	setContentType(ContentType.JSON).build();
	Response res1 = given().spec(req).when().get("/api/users/2");
	//assertThat().statusCode(200).and().contentType(ContentType.JSON).build();
	((RequestSpecification) extract()).response();
	System.out.println(res1.asString());
}

private static Object extract() {
	// TODO Auto-generated method stub
	return null;
}

private static RequestSpecBuilder setContentType(ContentType json) {
	// TODO Auto-generated method stub
	return null;
}


}

