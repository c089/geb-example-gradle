import geb.Page

class EnglishWikipedia extends Page {
    static at = { title == 'Wikipedia, the free encyclopedia' }
    static content = {
        mainPageLink  { $('li#n-mainpage-description a')   }
    }

}
