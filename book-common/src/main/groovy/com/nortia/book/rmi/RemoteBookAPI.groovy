package com.nortia.book.rmi

import java.rmi.RemoteException
import java.rmi.Remote

import com.nortia.book.Book;

interface RemoteBookAPI extends Remote{
	List list() throws RemoteException
	boolean add(Book b) throws RemoteException
	void clearAll() throws RemoteException
}