package book.client

import com.nortia.book.rmi.RemoteBookAPI
import com.nortia.book.rmi.RemoteBookClient
import com.nortia.book.Book

class BookService {

	RemoteBookClient remote
	RemoteBookAPI remoteBookAPI

    void serviceInit() {
    	log.info"serviceInit..."

		this.remote=new RemoteBookClient("localhost",1234)
		this.remoteBookAPI=this.remote.getRemoteAPI()

		log.info"serviceInit...OK"
    }

    void serviceDestroy() {
    	log.info"serviceDestroy..."

    	this.remote?.close()

    	log.info"serviceDestroy...OK"
    }

	List list(){
		return remoteBookAPI.list()
        //return Book.list()
	}
	boolean add(String title, String author){
        try{
            return remoteBookAPI.add([title:title,author:author])    
        }catch(e){
            log.error e.message
            return false
        }
		
        //b.save()
	}
	void clearAll(){
		remoteBookAPI.clearAll()
        //Book.executeUpdate("delete Book")
    }
}
