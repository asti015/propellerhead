DROP TABLE IF EXISTS customerRecord;
CREATE TABLE customerRecord (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  address VARCHAR (255) NOT NULL,
  email VARCHAR (100) NOT NULL,
  phone VARCHAR (100),
  PRIMARY KEY (id));
  
DROP TABLE IF EXISTS productRecord;
  create table productRecord (id integer not null auto_increment, 
  productNumber varchar (255), 
  description varchar (255), 
  itemPrice decimal(8,2), 
  primary key (id), 
  unique key (productNumber));
  
DROP TABLE IF EXISTS orderRecord;
  create table orderRecord (id integer not null auto_increment, 
  orderNumber varchar (255), 
  orderStatus varchar(255), 
  creationTime varchar(255),
  customerRecordId integer,
  customerName varchar (255),
  primary key (id));
  
DROP TABLE IF EXISTS orderedProduct;
  create table orderedProduct (id integer not null auto_increment, 
  orderRecord integer, 
  product integer, 
  quantity integer,
  totalPrice decimal(8,2), 
  primary key (id));
