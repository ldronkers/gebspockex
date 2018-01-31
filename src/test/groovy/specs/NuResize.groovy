package specs

import geb.spock.GebSpec
import org.openqa.selenium.Dimension
import pages.NuHome

class NuResize extends GebSpec {

    Dimension dimension;

    def setup(){
        this.dimension = getDriver().manage().window().getSize();
    }

    def "test if the hamburger menu appears"(){
        given:
        to NuHome

        when:
        resizeWindow(600, 500)

        then:
        assert hamburgerMenu.isDisplayed()
    }

    def cleanup(){
        getDriver().manage().window().setSize(this.dimension)
    }
}
