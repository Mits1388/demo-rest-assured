package by.vek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class LoginTest {
    @Test
    @DisplayName("sign in incorrect email")
    public void test1(){
        given()
                .body(by.vek.LoginRequest.getBody("mits1388@gmail.ru","rwwerwerwe"))
                .headers("Content-Type","application/json")
        .when()
                .post(by.vek.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("Проверьте email"));
    }

    @Test
    @DisplayName("sign in no email")
    public void test2(){
        given()
                .body(by.vek.LoginRequest.getBody(" ","rwwerwerwe"))
                .headers("Content-Type","application/json")
        .when()
                .post(by.vek.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("Ошибка валидации поля email"));
    }

    @Test
    @DisplayName("sign in incorrect password")
    public void test3(){
        given()
                .body(by.vek.LoginRequest.getBody("mits1388@gmail.com","rwwerwerwe"))
                .headers("Content-Type","application/json")
        .when()
                .post(by.vek.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("Неправильный пароль"));
    }

    @Test
    @DisplayName("sign in no password")
    public void test4(){
        given()
                .body(by.vek.LoginRequest.getBody("mits1388@gmail.com"," "))
                .headers("Content-Type","application/json")
        .when()
                .post(by.vek.LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("error", equalTo("Длина поля password должна быть от 6 до 32 символов"));
    }
}
