package pages

import geb.Page
import modules.WikipediaSearch

class WikipediaTheCure extends Page{
    static url = "https://en.wikipedia.org/wiki/The_Cure";

    static at = { title == "The Cure - Wikipedia" }

    static content = {
        searchBox {module(WikipediaSearch)}
    }
}
