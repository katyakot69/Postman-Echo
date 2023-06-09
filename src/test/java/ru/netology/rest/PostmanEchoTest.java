package ru.netology.rest;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void shouldReturnBody() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", Matchers.is("some data" ))
        ;
    }

}

