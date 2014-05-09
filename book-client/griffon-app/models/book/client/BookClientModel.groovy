package book.client

import ca.odell.glazedlists.BasicEventList
import ca.odell.glazedlists.swing.EventTableModel
import ca.odell.glazedlists.gui.WritableTableFormat

class BookClientModel {
	static final List _COLUMN_NAMES=["Title","Author"]
	/**
	List with info
	**/
	BasicEventList books

	/**
	Table model
	**/
	EventTableModel booksTableModel

	/**
	Table format describing table structure
	**/
    private final WritableTableFormat tableFormat=[
      getColumnCount: { 
      		return _COLUMN_NAMES.size()
      	},
      getColumnName: { index -> 
      	_COLUMN_NAMES[index] 
      },
      getColumnValue: {object, index -> 
      	object."${_COLUMN_NAMES[index].toLowerCase()}"
      },
      isEditable: {object, column -> 
      	return false
      }
    ] as WritableTableFormat	


    void mvcGroupInit(Map args) {
    	books=new BasicEventList()
		booksTableModel=new EventTableModel(books,tableFormat)     	
    }	

}