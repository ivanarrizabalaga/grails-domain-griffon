package com.nortia.book.rmi

import org.cojen.dirmi.*
import org.cojen.dirmi.io.*
import org.springframework.beans.factory.InitializingBean

import com.nortia.book.BookService

class RemoteBookServer implements InitializingBean{

	Environment env
	int port
	BookService service

	RemoteBookServer(int port){
		this.port=port		
	}
	
	public void afterPropertiesSet() throws Exception{
		Environment env = new Environment()
		SessionAcceptor sessionAcceptor=env.newSessionAcceptor(port)
		sessionAcceptor.acceptAll(service)
	}
}