import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.HashMap;
import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;

public class Tests_PATCH {


    @Test
    public void test_01_post(){


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
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();
    }
}
