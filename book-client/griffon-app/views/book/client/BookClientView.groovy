package book.client

import javax.swing.BorderFactory
import javax.swing.JTable
import javax.swing.ListSelectionModel
import java.awt.Color
import java.util.List 
import ca.odell.glazedlists.gui.*
import ca.odell.glazedlists.swing.*
import com.nortia.book.SampleEnum

application(title: SampleEnum.TITLE,
  preferredSize: [640, 480],
  pack: true,
  locationByPlatform: true,
  iconImage:   imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {

  migLayout (layoutConstraints: 'fillx')    
  
  textField(id:"titleField",constraints:'growx, wrap')      
  textField(id:"authorField",constraints:'growx,wrap')    

  button("Add",actionPerformed:controller.addBook,constraints:'span,align right,wrap')

  scrollPane(constraints:"span,growx"){
    table(id:"myTable",model:model.booksTableModel)
  }    

  button("Clear all",actionPerformed:controller.clearAll,constraints:'span,align right,wrap')

}
