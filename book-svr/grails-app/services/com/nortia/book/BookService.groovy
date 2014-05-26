package com.nortia.book

import grails.transaction.Transactional

import java.rmi.RemoteException

import com.nortia.book.rmi.RemoteBookAPI

@Transactional
class BookService implements RemoteBookAPI{	

	private static final long serialVersionUID = 1L;

	List list() throws RemoteException{
		log.info "-->list()"
		return Book.list()
	}
	boolean add(Book b) throws RemoteException{
		log.info "-->add(${b.title},${b.author})"
		Book book=new Book(title:b.title,author:b.author)
		return book.save()
	}
	void clearAll() throws RemoteException{
		log.info "-->clearAll()"
		Book.executeUpdate("delete Book")
	}
}
