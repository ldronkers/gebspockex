package pages

import geb.Page
import org.openqa.selenium.Dimension
import org.openqa.selenium.WebDriver

class NuHome extends Page{
    static url = "https://www.nu.nl/"

    static at = {
        title == "NU - Het laatste nieuws het eerst op NU.nl"
    }

    static content = {
        hamburgerMenu { $("button", class: "btn toggle-menu menu-left jPushMenuBtn") }
        mainMenuItem { $("span", class: "nav-item-text", text: "Voorpagina")}
    }

    void resizeWindow(){
        Dimension dimension = new Dimension(400, 700)
        WebDriver driver = getDriver()
        driver.manage().window().setSize(dimension)
        sleep(2000) // see what's going on, delete if used
    }
}
