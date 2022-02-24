package org.rprakashg;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.rprakashg.quarkus.models.Greeting;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testHelloEndpoint() {
        String expected = "Hello ram";

        Greeting got = given()
          .when().get("/greeting/ram")
          .then()
             .statusCode(200)
                .extract()
                .as(Greeting.class);
        assert(expected).equals(got.getMessage());
    }

}