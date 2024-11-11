package net.zaycev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    @DisplayName("sign in incorrect email")
    public void test1(){
        given()
                .body(net.zaycev.LoginRequest.getBody("mits1388@gmail.ru","rwwerwerwe"))
                .headers("Content-Type","application/json")
        .when()
                .post(net.zaycev.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("wrong login or password"));
    }

    @Test
    @DisplayName("sign in incorrect password")
    public void test2(){
        given()
                .body(net.zaycev.LoginRequest.getBody("mits1388@gmail.com","rwwerwerwe"))
                .headers("Content-Type","application/json")
        .when()
                .post(net.zaycev.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("wrong login or password"));
    }
}
