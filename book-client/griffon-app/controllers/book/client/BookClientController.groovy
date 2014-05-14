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
        //List books=Book.list()
        List books=bookService.list()
        edt{
            model.books.addAll(books)
        }
        
    }

    def addBook= {evt=null->
        Book b=bookService.add(view.titleField.text,view.authorField.text)
        edt{
            model.books.add(b)
            view.titleField.text=""
            view.authorField.text=""
        }
    }

    def clearAll= {evt=null->
        bookService.clearAll()
        edt{
            model.books.clear()
        }
    }    
}
