// Place your Spring DSL code here
import com.nortia.book.rmi.*

beans = {
	remotingServer(com.nortia.book.rmi.RemoteBookServer,1234){
		service=ref("bookService")
	}
}
