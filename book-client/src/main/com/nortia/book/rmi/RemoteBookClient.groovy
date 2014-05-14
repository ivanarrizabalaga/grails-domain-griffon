package com.nortia.book.rmi
import org.cojen.dirmi.*

class RemoteBookClient{
	String address
	int port
	Environment env

	RemoteBookAPI remoteAPI

	RemoteBookClient(String address, int port){
		this.address=address
		this.port=port
		env = new Environment()
        try{
            SessionConnector sessionConnector=env.newSessionConnector(address, port)
            Session session=sessionConnector.connect()
            Object obj=session.receive()
            this.remoteAPI= (RemoteBookAPI) obj
        }catch(e){
            println e
            throw e
        }
	}

	RemoteBookAPI getRemoteAPI(){
		return this.remoteAPI
	}

	void close(){
		env.close()
	}
	
}