grails-domain-griffon
=====================

An attempt to create sample project made of 3 parts talking via RMI: a grails server, a griffon client and a grails binary plugin with domains in the middle.

The concept is:
 

 book-svr (grails app) <------------> book-client(griffon app)   
   |                                                  |   
   |-----------book-remote(grails binary plugin)------|   
                     -Book.groovy (domain)   
                     -RemoteBookAPI (Remote) 


notes
=====================

It finally fails, since the griffon project requires a full web context prepared while using the grails domains, :(


Let's update shared-groovy-domain following the set of rules from Graeme [http://stackoverflow.com/questions/23805439/using-grails-plugin-classes-in-a-groovy-project/23807207](http://stackoverflow.com/questions/23805439/using-grails-plugin-classes-in-a-groovy-project/23807207).