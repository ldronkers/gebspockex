package specs

import geb.spock.GebSpec
import pages.TiDragAndDrop

class DragAndDrop extends GebSpec{
    def "test drag and drop"(){
        given:
        to TiDragAndDrop

        when:
        assert ab.isDisplayed()

        and:
        moveElement()

        then:
        assert ba.isDisplayed()
    }

}
