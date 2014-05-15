package com.nortia.book

import grails.transaction.Transactional

import java.rmi.RemoteException

import com.nortia.book.rmi.RemoteBookAPI

@Transactional
class BookService implements RemoteBookAPI{	

	private static final long serialVersionUID = 1L;

	List list() throws RemoteException{
		return Book.list()
	}
	boolean add(Map params) throws RemoteException{
		Book book=new Book(title:params.title,author:params.author)
		return book.save()
	}
	void clearAll() throws RemoteException{
		Book.executeUpdate("delete Book")
	}
}
