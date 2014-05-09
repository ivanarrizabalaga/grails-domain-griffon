package book.client
import bookdomain.Book

class BookClientController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        loadData()
    }       

    void loadData(){
        List books=Book.list()
        edt{
            model.books.addAll(books)
        }
        
    }

    def addBook= {evt=null->
        Book b=new Book(title:view.titleField.text,author:view.authorField.text)
        b.save()
        edt{
            model.books.add(b)
            view.titleField.text=""
            view.authorField.text=""
        }
    }

    def clearAll= {evt=null->
        Book.executeUpdate("delete Book")    
        edt{
            model.books.clear()
        }
    }    
}
