import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Tests_DELETE {

    @Test
    public void test_01_delete(){





                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();
    }
}
