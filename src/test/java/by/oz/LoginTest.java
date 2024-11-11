package by.oz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    @DisplayName("sign in no phone")
    public void test1(){
        given()
                .body(by.oz.LoginRequest.getBody(" "))
                .headers("Content-Type","application/json")
        .when()
                .post(by.oz.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(422)
                .body("error", equalTo("Введите номер мобильного телефона белорусских операторов"));
    }

    @Test
    @DisplayName("sign in incorrect phone")
    public void test2(){
        given()
                .body(by.oz.LoginRequest.getBody("375008564032"))
                .headers("Content-Type","application/json")
        .when()
                .post(by.oz.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(422)
                .body("error", equalTo("Введите корректный номер мобильного телефона"));
    }

    @Test
    @DisplayName("sign in correct phone")
    public void test3(){
        given()
                .body(by.oz.LoginRequest.getBody("375298564032"))
                .headers("Content-Type","application/json")
        .when()
                .post(by.oz.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(201);
    }
}
