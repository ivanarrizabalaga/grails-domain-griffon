package com.nortia.book
import grails.persistence.Entity

@Entity
class Book implements Serializable{

    private static final long serialVersionUID = 1L;

	String title
	String author

    static constraints = {
        title blank:false
        author blank:false
    }
}
