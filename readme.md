This is an example of running geb tests in parallel using JUnit. It is currently broken due to a concurrency issue.

The build is setup to work with HTMLUnit, FireFox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

The following commands will launch the tests with the individual browsers:

    ./gradlew htmlunitTest
    ./gradlew chromeTest
    ./gradlew firefoxTest

To run with all, you can run:

    ./gradlew test
