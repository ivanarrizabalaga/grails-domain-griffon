package bookdomain
import grails.persistence.Entity

@Entity
class Book{
	String title
	String author

    static constraints = {
        title blank:false
        author blank:false
    }

}