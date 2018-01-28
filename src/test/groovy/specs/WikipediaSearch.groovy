package specs

import geb.spock.GebSpec
import pages.WikipediaHome
import pages.WikipediaTheCure

class WikipediaSearch extends GebSpec{

    def "search for the cure"(){
        given:
        to WikipediaHome

        when:
        searchBox.search("The Cure")

        then:
        at WikipediaTheCure
    }
}
