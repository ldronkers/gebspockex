package pages

import geb.Page
import modules.WikipediaSearch

class WikipediaHome extends Page{
    static url = "https://en.wikipedia.org/wiki/Main_Page"

    static at = {
        title == "Wikipedia, the free encyclopedia"
    }

    static content = {
        searchBox {module(WikipediaSearch)}
    }
}
