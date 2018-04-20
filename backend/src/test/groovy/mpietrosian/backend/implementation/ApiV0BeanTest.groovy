import mpietrosian.backend.Application
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.*

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(classes = Application.class, webEnvironment = RANDOM_PORT)
class ApiV0BeanTest extends Specification {


}
