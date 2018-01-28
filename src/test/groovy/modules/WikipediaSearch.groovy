package modules

import geb.Module

class WikipediaSearch extends Module{
    static content = {
        inputSearch { $("input", id: "searchInput") }
        buttonSearch { $("input", id: "searchButton") }
    }

    void search(String value){
        inputSearch << value
        buttonSearch.click()
        sleep(3000)
    }
}
