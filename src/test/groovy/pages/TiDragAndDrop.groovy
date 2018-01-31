package pages

import geb.Page
import org.openqa.selenium.By

class TiDragAndDrop extends Page{
    static url = "http://the-internet.herokuapp.com/drag_and_drop"

    static at = {
        title == "The Internet"
    }

    static content = {
        columnA { $("div", id: "column-a") }
        ab {$(By.xpath("//div[@id='columns']/div[@id='column-a']"))}
        ba {$(By.xpath("//div[@id='columns']/div[@id='column-b']"))}
    }

    void moveElement(){
        interact {
            dragAndDropBy(columnA, 150, 0)
        }
    }
}
