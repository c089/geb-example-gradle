import geb.Browser
import org.openqa.selenium.WebDriver
import org.junit.After
import org.junit.Before

class GebBareConcurrentTest {
    static final ThreadLocal<Browser> BROWSER_THREAD_LOCAL = new ThreadLocal<Browser>()

    WebDriver getDriver() { return getBrowser().getDriver() }
    Browser getBrowser() {
        println Thread.currentThread().toString() + " getting " +  BROWSER_THREAD_LOCAL.get()
        return BROWSER_THREAD_LOCAL.get()
    }

    @Before
    void createBrowser() {
        def browser = new Browser()
        browser.config.cacheDriver = false
        browser.config.autoClearCookies = false
        BROWSER_THREAD_LOCAL.set(browser)
        println Thread.currentThread().toString() + " created new browser " +  BROWSER_THREAD_LOCAL.get()
    }

    @After
    void deleteBrowser() {
        getBrowser().getDriver().quit()
        BROWSER_THREAD_LOCAL.remove()
    }

    def methodMissing(String name, args) {
        getBrowser()."$name"(*args)
    }

    def propertyMissing(String name) {
        getBrowser()."$name"
    }

    def propertyMissing(String name, value) {
        getBrowser()."$name" = value
    }
}
