import org.junit.runner.RunWith
import org.junit.Test

@RunWith(ParallelRunner)
class SomeUselessTests extends GebBareConcurrentTest {
    void uselessTestMethod() {
        println Thread.currentThread().toString() + " Running test using browser $browser and driver $driver."
        5.times {
            to Wikipedia
            assert at(Wikipedia)
            toEnglishWikiLink.click()
            assert at(EnglishWikipedia)
            assert mainPageLink.text() == 'Main page'
        }
    }

    @Test void test0() { uselessTestMethod() }
    @Test void test1() { uselessTestMethod() }
    @Test void test2() { uselessTestMethod() }
    @Test void test3() { uselessTestMethod() }
    @Test void test4() { uselessTestMethod() }
    @Test void test5() { uselessTestMethod() }
    @Test void test6() { uselessTestMethod() }
    @Test void test7() { uselessTestMethod() }
    @Test void test8() { uselessTestMethod() }
    @Test void test9() { uselessTestMethod() }
    @Test void testa() { uselessTestMethod() }
    @Test void testb() { uselessTestMethod() }
    @Test void testc() { uselessTestMethod() }
    @Test void testd() { uselessTestMethod() }
    @Test void teste() { uselessTestMethod() }
    @Test void testf() { uselessTestMethod() }

}
