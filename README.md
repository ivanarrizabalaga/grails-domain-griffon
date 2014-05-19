grails-domain-griffon
=====================

An attempt to create sample project made of 3 parts talking via RMI: a grails server, a griffon client and a grails binary plugin with domains in the middle.

The concept is:
 

 book-svr (grails app) <------------> book-client(griffon app)
   |                                                  |
   |-----------book-remote(grails binary plugin)------|
                     -Book.groovy (domain)
                     -RemoteBookAPI (Remote)
