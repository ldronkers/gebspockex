# gebspockex

# run with chrome
./gradlew browse

# run chrome headless
./gradlew browse -Dgeb.env=chromeHeadless

# run single spec
./gradlew browse -Dgeb.env=chromeHeadless --tests *ExampleSpec