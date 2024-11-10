package by.tabletka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    public void test1(){
        given()
                .body(LoginRequest.getBody())
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test2(){
        String body = "";

        given()
                .body(body)
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }

    @Test
    @DisplayName("empty email")
    public void test3(){
        String body = "_csrf=CKuo-Ct-R-4b5Xfso9NQ2kiOwjijMKlcfWkOmDk2abx72eCaBickoyK6FpbQggefCseHd9tynRUyW2aqalBQ1A%3D%3D&password=weqweqweqwe";

        given()
                .body(body)
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    @DisplayName("empty password")
    public void test4(){
        String body = "_csrf=CKuo-Ct-R-4b5Xfso9NQ2kiOwjijMKlcfWkOmDk2abx72eCaBickoyK6FpbQggefCseHd9tynRUyW2aqalBQ1A%3D%3D&email=mits1388%40gmail.com";

        given()
                .body(body)
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test5(){
        given()
                .body(LoginRequest.getBody())
                .header("Content-Type","application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie","regionId=0; PHPSESSID=pf24qi6b47f7o4s18lvaie48qh; _csrf=38b13d81960bd53465b873203384b8f27aec6ca79435671cf21d3605610fc8cca%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22srHb-YcM9_azsQWEBIEOxB4IO2h2Sf9h%22%3B%7D")
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1));
    }

    @Test
    public void test6(){
        String body = "CKuo-Ct-R-4b5Xfso9NQ2kiOwjijMKlcfWkOmDk2abx72eCaBickoyK6FpbQggefCseHd9tynRUyW2aqalBQ1A%3D%3D";

        given()
                .body(body)
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }
}
