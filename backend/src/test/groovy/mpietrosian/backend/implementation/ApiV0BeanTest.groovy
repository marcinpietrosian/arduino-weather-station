import mpietrosian.backend.Application
import groovyx.net.http.RESTClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.context.embedded.LocalServerPort
import spock.lang.*

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(classes = Application.class, webEnvironment = RANDOM_PORT)
class ApiV0BeanTest extends Specification {

    @LocalServerPort
    int serverPort

    String serverHost = "localhost"

    RESTClient restClient = new RESTClient(serverHost + ":" + serverPort, JSON)

    def "return current weather" () {
        def response = restClient.get()
    }


}
