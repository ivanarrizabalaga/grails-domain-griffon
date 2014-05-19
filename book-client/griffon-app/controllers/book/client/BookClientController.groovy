package book.client

import com.nortia.book.Book

class BookClientController {
    // these will be injected by Griffon
    def model
    def view
    def bookService

    void mvcGroupInit(Map args) {
        loadData()
    }       

    void loadData(){
        List books=bookService.list()
        edt{
            view.titleField.text=""
            view.authorField.text=""            
            model.books.clear()
            
            model.books.addAll(books)
        }
        
    }

    def addBook= {evt=null->
        bookService.add(view.titleField.text,view.authorField.text)
        this.loadData()
    }

    def clearAll= {evt=null->
        bookService.clearAll()        
        this.loadData()
    }    
}
