package mpietrosian.backend.implementation

import mpietrosian.backend.Application
import groovyx.net.http.RESTClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import spock.lang.*
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(classes = Application.class, webEnvironment = RANDOM_PORT)
class ApiV0BeanTest extends Specification {

    @LocalServerPort
    int serverPort

    String serverHost = "localhost"


    def "get current weather" () {
        RestAssured.port = serverPort;

        given:
        def request = given()

        when:
        def response = request.with().get("/api/v1/services")
        
        then:
        response.statusCode == 404
        
    }


}
