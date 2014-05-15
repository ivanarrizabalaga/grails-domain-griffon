package com.nortia.book.rmi

import java.rmi.RemoteException
import java.rmi.Remote

interface RemoteBookAPI extends Remote{
	List list() throws RemoteException
	boolean add(Map params) throws RemoteException
	void clearAll() throws RemoteException
}