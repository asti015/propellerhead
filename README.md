# propellerhead

I have decided to try using spring boot JDBC for easier access to the database and have used the following example to do so:
https://www.mkyong.com/spring-boot/spring-boot-jdbc-mysql-hikaricp-example/

The current structure is the same as the example, and I am sure pretty wrong, but I ran out of time to try to tidy things up.
The following has been coded up until now:
- /spring-boot-jdbc/src/main/resources  contains the schema for the tables.  Be aware that the table schema is not completely correct.
  orderRecord is supposed to have an ENUM for the status and DATETIME for the creationTime but I had some problems with data coming out 
  of the repository in the wrong order (i had accidentally switched the order of a String and an int) which in turn was crashing mysql 
  and preventing me from building jars, so it took a while to figure out what happened and in the mean time i changed these two to varchar
  to make it easier for debugging but ran out of time to revert.  data.sql is in the same directory
- /spring-boot-jdbc/src/main/java/model contains the bean objects
- /spring-boot-jdbc/src/main/java/com/mkyong/dao contains the repositories for each table/object.  At the moment only methods are to 
  retrieve all of the objects. 
- /spring-boot-jdbc/src/main/java/com/mkyong contains the main console application used for testing the retrieval of data by the
  repositories.
- /spring-boot-jdbc/src/main/java/web contains main  project html with a simple table which contains sortable columns.  Used Bootstrap 
  to create the table.
  
Unfortunately i have also run out of time to connect the web end with the service to pull the data out directly.   

UPDATE:
Project structure has been fixed and front end table is populated with the data from the database.
Please create the database manually before running the code.
CREATE DATABASE customerOrderSystem;
also application.properties file needs to be changed to configure mysql database access.
  
