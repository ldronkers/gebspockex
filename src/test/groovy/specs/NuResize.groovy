package specs

import geb.spock.GebSpec
import pages.NuHome

class NuResize extends GebSpec {
    def "test if the hamburger menu appears"(){
        given:
        to NuHome

        and:
        assert mainMenuItem.isDisplayed()

        when:
        resizeWindow()

        then:
        assert hamburgerMenu.isDisplayed()
    }
}
