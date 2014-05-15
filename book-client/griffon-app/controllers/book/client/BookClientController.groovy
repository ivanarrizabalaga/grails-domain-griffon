package book.client

import com.nortia.book.Book
import javax.swing.JOptionPane

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
            model.books.clear()
            model.books.addAll(books)
        }
        
    }

    def addBook= {evt=null->
        boolean isAdded=bookService.add(view.titleField.text,view.authorField.text)
        edt{
            if(isAdded){
                view.titleField.text=""
                view.authorField.text=""
                this.loadData()                    
            }else{
                JOptionPane.showMessageDialog(null, "Book cannot be added to the collection", "Error", JOptionPane.ERROR_MESSAGE);            
            }
        }
    }

    def clearAll= {evt=null->
        bookService.clearAll()
        this.loadData()
    }    
}
