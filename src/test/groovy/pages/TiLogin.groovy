package pages

import geb.Page

class TiLogin extends Page{
    static url = "http://the-internet.herokuapp.com/login"

    static at = { title == "The Internet"}

    static content = {
        inputUserName {$("input#username")}
        inputPassword {$("input", id: "password")}
        buttonSubmit {$("button", text: "Login")}
        errorMessage {$("div", id: "flash")}
    }

    void login(String username, String password){
        inputUserName << username
        inputPassword << password
        buttonSubmit.click()
    }

    boolean errorIsDisplayed(String errorMessagePart){
        // Your password is invalid!
        return errorMessage.text().contains(errorMessagePart)
    }
}
