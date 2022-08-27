import io.restassured.http.ContentType;
import io.restassured.http.Header;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.HashMap;
import static io.restassured.RestAssured.*;


public class Tests_POST {

@Test
    public void test_01_post(){
//
//    Map<String , Object> map = new HashMap<String , Object>();
//    map.put("name" , "Razvan");
//    map.put("job" , "Quality Assurance");

//    System.out.println(map);
    JSONObject request = new JSONObject();

    request.put("name" , "Razvan");
    request.put("job" , "Quality Assurance");

    System.out.println(request);
    System.out.println(request.toJSONString());

    given().
            header("Content-Type" , "application/json").
            contentType(ContentType.JSON).accept(ContentType.JSON).
            body(request.toJSONString()).
            when().
            post("https://reqres.in/api/users").
            then().
            statusCode(201);
}



}
