package by.dominos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    @DisplayName("sign in no phone")
    public void test1() {
        given()
                .body(by.dominos.LoginRequest.getBody(" "))
                .headers("Content-Type", "application/json")
        .when()
                .post(by.dominos.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body("phone[0]", equalTo("Это поле не может быть пустым."));
    }

    @Test
    @DisplayName("sign in incorrect phone")
    public void test2() {
        given()
                .body(by.dominos.LoginRequest.getBody("375298564032"))
                .headers("Content-Type", "application/json")
        .when()
                .post(by.dominos.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(400)
                .body("phone[0]", equalTo("Введите корректный номер телефона."));
    }

    @Test
    @DisplayName("sign in correct phone")
    public void test3() {
        given()
                .body(by.dominos.LoginRequest.getBody("+375298564032"))
                .headers("Content-Type", "application/json")
        .when()
                .post(by.dominos.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200);
    }
}
