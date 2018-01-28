package specs

import spock.lang.Specification

class ExampleSpec extends Specification {

    def "test if my setup works"() {
        given:
        1 == 1

        when:
        1 == 1

        then:
        1 == 1
    }
}