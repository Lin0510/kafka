package org.acme.kafka.producer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@QuarkusTest
public class FormsResourceTest {

    @Test
    void testFormsEventStream() {
        String body = given()
                .when()
                .post("/forms/request")
                .then()
                .statusCode(200)
                .extract().body()
                .asString();
        assertDoesNotThrow(() -> UUID.fromString(body));
    }

}
