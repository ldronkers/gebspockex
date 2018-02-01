package specs

import geb.spock.GebSpec
import pages.TiLogin

class Login extends GebSpec{
    def "test login"(){
        when:
        to TiLogin

        and:
        login("test", "test")

        then:
        errorIsDisplayed("username is invalid")
    }
}
