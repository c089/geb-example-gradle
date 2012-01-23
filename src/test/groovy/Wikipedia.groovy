import geb.Page

class Wikipedia extends Page {
    static url = 'http://www.wikipedia.org/'
    static at = { title == 'Wikipedia' }

    static content = {
        bodyContent                             { $('div#bodyContent')                          }
        top10                                   { bodyContent.find('div.divTop10item')          }
        toEnglishWikiLink(to: EnglishWikipedia) { top10.find('a', title: startsWith('English')) }
    }

}
