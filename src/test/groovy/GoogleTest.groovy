import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GoogleTest extends GebReportingTest {
	
	@Test 
	void theFirstLinkShouldBeWikipedia() {
		to GoogleHomePage
		
		// enter wikipedia into the search field
		search.forTerm "wikipedia"

		// wait for the change to results page to happen
		// (google updates the page without a new request)
		assert at(GoogleResultsPage)

		// is the first link to wikipedia?
		assert firstResultLink.text() == "Wikipedia"

		// click the link
		firstResultLink.click()

		// wait for Google's javascript to redirect us
		// to wikipedia
		assert waitFor { at WikipediaPage }
	}
	
}