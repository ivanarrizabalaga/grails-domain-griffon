application {
    title = 'BookClient'
    startupGroups = ['book-client']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "book-client"
    'book-client' {
        model      = 'book.client.BookClientModel'
        view       = 'book.client.BookClientView'
        controller = 'book.client.BookClientController'
    }

}
