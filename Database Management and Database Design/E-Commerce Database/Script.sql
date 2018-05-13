-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Schema e-commerce_database
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `e-commerce_database` DEFAULT CHARACTER SET utf8 ;
USE `e-commerce_database` ;

-- -----------------------------------------------------
-- Table `e-commerce_database`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`address` (
  `Address_id` INT(11) NOT NULL,
  `Line_1` VARCHAR(45) NOT NULL,
  `Line_2` VARCHAR(45) NOT NULL,
  `City` VARCHAR(45) NOT NULL,
  `State` VARCHAR(45) NOT NULL,
  `ZIP` INT(11) NOT NULL,
  `Country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Address_id`),
  UNIQUE INDEX `Address_id_UNIQUE` (`Address_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`billing_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`billing_details` (
  `Billing_Id` INT(11) NOT NULL AUTO_INCREMENT,
  `Billing_Date` DATE NOT NULL,
  `Address_Address_id` INT(11) NOT NULL,
  PRIMARY KEY (`Billing_Id`, `Address_Address_id`),
  UNIQUE INDEX `Billing_Id_UNIQUE` (`Billing_Id` ASC),
  INDEX `fk_Billing_Details_Address1_idx` (`Address_Address_id` ASC),
  CONSTRAINT `fk_Billing_Details_Address1`
    FOREIGN KEY (`Address_Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 9005
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`customer` (
  `Customer_id` INT(11) NOT NULL AUTO_INCREMENT,
  `First_Name` VARCHAR(45) NOT NULL,
  `Last_Name` VARCHAR(45) NOT NULL,
  `Age` TINYINT(10) NOT NULL,
  `Gender` ENUM('Male', 'Female') NOT NULL,
  `phone_id` VARCHAR(15) NULL DEFAULT NULL,
  `emailid` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`Customer_id`),
  UNIQUE INDEX `Customer_id_UNIQUE` (`Customer_id` ASC),
  INDEX `Phone_id_idx` (`phone_id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 5008
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`payment_option`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`payment_option` (
  `payment_id` INT(11) NOT NULL AUTO_INCREMENT,
  `Transaction_Status` ENUM('Completed', 'Pending') NOT NULL,
  `Customer_Id` INT(11) NOT NULL,
  `Payment_Date` DATE NOT NULL,
  PRIMARY KEY (`payment_id`, `Customer_Id`),
  UNIQUE INDEX `payment_id_UNIQUE` (`payment_id` ASC),
  INDEX `Customer_id_idx` (`Customer_Id` ASC),
  CONSTRAINT `Customer_id`
    FOREIGN KEY (`Customer_Id`)
    REFERENCES `e-commerce_database`.`customer` (`Customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 304
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`cardtype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`cardtype` (
  `Type_Card` ENUM('CC', 'DC') NOT NULL,
  `Card_Holder_Name` VARCHAR(45) NOT NULL,
  `Bank_Name` VARCHAR(45) NOT NULL,
  `Exp_Month` VARCHAR(45) NOT NULL,
  `Exp_Year` VARCHAR(45) NOT NULL,
  `Card_Number` VARCHAR(16) NOT NULL,
  `Payment_Option_payment_id` INT(11) NOT NULL,
  PRIMARY KEY (`Payment_Option_payment_id`, `Card_Number`),
  INDEX `fk_CardType_Payment_Option1_idx` (`Payment_Option_payment_id` ASC),
  CONSTRAINT `fk_CardType_Payment_Option1`
    FOREIGN KEY (`Payment_Option_payment_id`)
    REFERENCES `e-commerce_database`.`payment_option` (`payment_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`category` (
  `Category_id` INT(11) NOT NULL AUTO_INCREMENT,
  `Category_Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Category_id`),
  UNIQUE INDEX `idCategory_UNIQUE` (`Category_id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 103
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`customer_has_address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`customer_has_address` (
  `Customer_Customer_id` INT(11) NOT NULL,
  `Address_Address_id` INT(11) NOT NULL,
  PRIMARY KEY (`Customer_Customer_id`, `Address_Address_id`),
  INDEX `fk_Customer_has_Address_Address1_idx` (`Address_Address_id` ASC),
  INDEX `fk_Customer_has_Address_Customer1_idx` (`Customer_Customer_id` ASC),
  CONSTRAINT `fk_Customer_has_Address_Address1`
    FOREIGN KEY (`Address_Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_has_Address_Customer1`
    FOREIGN KEY (`Customer_Customer_id`)
    REFERENCES `e-commerce_database`.`customer` (`Customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`delivery_boy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`delivery_boy` (
  `idDelivery_Boy` INT(11) NOT NULL AUTO_INCREMENT,
  `First_Name` VARCHAR(45) NOT NULL,
  `Last_Name` VARCHAR(45) NOT NULL,
  `Age` INT(11) NOT NULL,
  `Gender` ENUM('Male', 'Female') NOT NULL,
  `phone_number` VARCHAR(45) NULL DEFAULT NULL,
  `email-id` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idDelivery_Boy`),
  UNIQUE INDEX `idDelivery_Boy_UNIQUE` (`idDelivery_Boy` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 201
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`delivery_boy_has_address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`delivery_boy_has_address` (
  `Delivery_Boy_idDelivery_Boy` INT(11) NOT NULL,
  `Address_Address_id` INT(11) NOT NULL,
  PRIMARY KEY (`Delivery_Boy_idDelivery_Boy`, `Address_Address_id`),
  INDEX `fk_Delivery_Boy_has_Address_Address1_idx` (`Address_Address_id` ASC),
  INDEX `fk_Delivery_Boy_has_Address_Delivery_Boy1_idx` (`Delivery_Boy_idDelivery_Boy` ASC),
  CONSTRAINT `fk_Delivery_Boy_has_Address_Address1`
    FOREIGN KEY (`Address_Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Delivery_Boy_has_Address_Delivery_Boy1`
    FOREIGN KEY (`Delivery_Boy_idDelivery_Boy`)
    REFERENCES `e-commerce_database`.`delivery_boy` (`idDelivery_Boy`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`manufacturer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`manufacturer` (
  `Manufacturer_id` INT(11) NOT NULL DEFAULT '150',
  `Manufacturer_Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Manufacturer_id`),
  UNIQUE INDEX `Manufacturer_id_UNIQUE` (`Manufacturer_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`subcategory`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`subcategory` (
  `SubCategory_id` INT(11) NOT NULL AUTO_INCREMENT,
  `SubCategoryName` VARCHAR(45) NOT NULL,
  `Category_id` INT(11) NOT NULL,
  PRIMARY KEY (`SubCategory_id`, `Category_id`),
  UNIQUE INDEX `idSubCategory_UNIQUE` (`SubCategory_id` ASC),
  INDEX `Category_id_idx` (`Category_id` ASC),
  CONSTRAINT `Category_id`
    FOREIGN KEY (`Category_id`)
    REFERENCES `e-commerce_database`.`category` (`Category_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 205
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`product` (
  `Product_id` INT(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` VARCHAR(45) NOT NULL,
  `Product_description` VARCHAR(45) NOT NULL,
  `Product_Catalog_id` INT(11) NOT NULL,
  `Manufacturer_id` INT(11) NOT NULL,
  `Price` DOUBLE NOT NULL,
  PRIMARY KEY (`Product_id`, `Manufacturer_id`, `Product_Catalog_id`),
  UNIQUE INDEX `idProduct_UNIQUE` (`Product_id` ASC),
  INDEX `Product_Catalog_id_idx` (`Product_Catalog_id` ASC),
  INDEX `Manufacturer_id_idx` (`Manufacturer_id` ASC),
  CONSTRAINT `Manufacturer_id`
    FOREIGN KEY (`Manufacturer_id`)
    REFERENCES `e-commerce_database`.`manufacturer` (`Manufacturer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Product_Catalog_id`
    FOREIGN KEY (`Product_Catalog_id`)
    REFERENCES `e-commerce_database`.`subcategory` (`SubCategory_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1008
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`product_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`product_details` (
  `idProduct_Details` INT(11) NOT NULL AUTO_INCREMENT,
  `Size` VARCHAR(45) NOT NULL,
  `Colour` VARCHAR(45) NOT NULL,
  `Availablity` VARCHAR(45) NOT NULL,
  `Discount_Available` VARCHAR(45) NOT NULL,
  `Product_Product_id` INT(11) NOT NULL,
  PRIMARY KEY (`idProduct_Details`, `Product_Product_id`),
  UNIQUE INDEX `idProduct_Details_UNIQUE` (`idProduct_Details` ASC),
  INDEX `fk_Product_Details_Product1_idx` (`Product_Product_id` ASC),
  CONSTRAINT `fk_Product_Details_Product1`
    FOREIGN KEY (`Product_Product_id`)
    REFERENCES `e-commerce_database`.`product` (`Product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2015
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`shipping_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`shipping_details` (
  `Shipper_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ShippingDate` DATE NOT NULL,
  `Address_id` INT(11) NOT NULL,
  `idDelivery_Boy` INT(11) NOT NULL,
  PRIMARY KEY (`Shipper_id`, `Address_id`, `idDelivery_Boy`),
  UNIQUE INDEX `Shipper_id_UNIQUE` (`Shipper_id` ASC),
  INDEX `Address_id_idx` (`Address_id` ASC),
  INDEX `idDelivery_Boy_idx` (`idDelivery_Boy` ASC),
  CONSTRAINT `Address_id`
    FOREIGN KEY (`Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idDelivery_Boy`
    FOREIGN KEY (`idDelivery_Boy`)
    REFERENCES `e-commerce_database`.`delivery_boy` (`idDelivery_Boy`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 405
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`order_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`order_table` (
  `Order_Id` INT(11) NOT NULL AUTO_INCREMENT,
  `ProductDetails_id` INT(11) NOT NULL,
  `OrderDate` DATE NOT NULL,
  `ShipperID` INT(11) NOT NULL,
  `BillingID` INT(11) NOT NULL,
  `cardtype_Payment_Option_payment_id` INT(11) NOT NULL,
  `cardtype_Card_Number` VARCHAR(16) NOT NULL,
  `quantity` INT(10) NOT NULL,
  PRIMARY KEY (`Order_Id`, `ProductDetails_id`, `ShipperID`, `BillingID`, `cardtype_Payment_Option_payment_id`, `cardtype_Card_Number`),
  UNIQUE INDEX `Order_Id_UNIQUE` (`Order_Id` ASC),
  INDEX `Shipper_id_idx` (`ShipperID` ASC),
  INDEX `Billing_Id_idx` (`BillingID` ASC),
  INDEX `Product_id_idx` (`ProductDetails_id` ASC),
  INDEX `fk_order_cardtype1_idx` (`cardtype_Payment_Option_payment_id` ASC, `cardtype_Card_Number` ASC),
  CONSTRAINT `Billing_Id`
    FOREIGN KEY (`BillingID`)
    REFERENCES `e-commerce_database`.`billing_details` (`Billing_Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Product_id`
    FOREIGN KEY (`ProductDetails_id`)
    REFERENCES `e-commerce_database`.`product_details` (`idProduct_Details`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Shipper_id`
    FOREIGN KEY (`ShipperID`)
    REFERENCES `e-commerce_database`.`shipping_details` (`Shipper_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_cardtype1`
    FOREIGN KEY (`cardtype_Payment_Option_payment_id` , `cardtype_Card_Number`)
    REFERENCES `e-commerce_database`.`cardtype` (`Payment_Option_payment_id` , `Card_Number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6005
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`product_backup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`product_backup` (
  `userName` VARCHAR(33) NULL DEFAULT NULL,
  `System Date` DATE NULL DEFAULT NULL,
  `Product_id` INT(11) NULL DEFAULT NULL,
  `Product_Name` VARCHAR(45) NULL DEFAULT NULL,
  `Product_description` VARCHAR(45) NULL DEFAULT NULL,
  `Product_Catalog_id` INT(11) NULL DEFAULT NULL,
  `Manufacturer_id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`product_details_backup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`product_details_backup` (
  `userName` VARCHAR(33) NULL DEFAULT NULL,
  `System Date` DATE NULL DEFAULT NULL,
  `idProduct_Details` INT(11) NULL DEFAULT NULL,
  `Size` VARCHAR(45) NULL DEFAULT NULL,
  `Colour` VARCHAR(45) NULL DEFAULT NULL,
  `Availablity` VARCHAR(45) NULL DEFAULT NULL,
  `Discount_Available` VARCHAR(45) NULL DEFAULT NULL,
  `Product_Product_id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`supplier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`supplier` (
  `Supplier_Id` INT(11) NOT NULL AUTO_INCREMENT,
  `CompanyName` VARCHAR(45) NOT NULL,
  `URL` VARCHAR(45) NOT NULL,
  `Address_Address_id` INT(11) NOT NULL,
  `phone_number` VARCHAR(45) NULL DEFAULT NULL,
  `email-id` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`Supplier_Id`, `Address_Address_id`),
  INDEX `fk_Supplier_Address1_idx` (`Address_Address_id` ASC),
  CONSTRAINT `fk_Supplier_Address1`
    FOREIGN KEY (`Address_Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`supplier_contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`supplier_contact` (
  `ContactId` INT(11) NOT NULL AUTO_INCREMENT,
  `Contact_fName` VARCHAR(45) NOT NULL,
  `Contact_lName` VARCHAR(45) NOT NULL,
  `Age` VARCHAR(45) NOT NULL,
  `Gender` ENUM('Male', 'Female') NOT NULL,
  `Supplier_id` INT(11) NOT NULL,
  `phone_number` VARCHAR(45) NULL DEFAULT NULL,
  `email-id` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ContactId`, `Supplier_id`),
  UNIQUE INDEX `ContactId_UNIQUE` (`ContactId` ASC),
  INDEX `Supplier_id_idx` (`Supplier_id` ASC),
  CONSTRAINT `Supplier_id`
    FOREIGN KEY (`Supplier_id`)
    REFERENCES `e-commerce_database`.`supplier` (`Supplier_Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 54
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`supplier_contact_has_address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`supplier_contact_has_address` (
  `Supplier_Contact_ContactId` INT(11) NOT NULL,
  `Address_Address_id` INT(11) NOT NULL,
  PRIMARY KEY (`Supplier_Contact_ContactId`, `Address_Address_id`),
  INDEX `fk_Supplier_Contact_has_Address_Address1_idx` (`Address_Address_id` ASC),
  INDEX `fk_Supplier_Contact_has_Address_Supplier_Contact1_idx` (`Supplier_Contact_ContactId` ASC),
  CONSTRAINT `fk_Supplier_Contact_has_Address_Address1`
    FOREIGN KEY (`Address_Address_id`)
    REFERENCES `e-commerce_database`.`address` (`Address_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Supplier_Contact_has_Address_Supplier_Contact1`
    FOREIGN KEY (`Supplier_Contact_ContactId`)
    REFERENCES `e-commerce_database`.`supplier_contact` (`ContactId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `e-commerce_database`.`supply`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `e-commerce_database`.`supply` (
  `Product_Product_id` INT(11) NOT NULL,
  `quantity` INT(11) NOT NULL,
  `Supply_Date` DATE NOT NULL,
  `Supplier_Contact_id` INT(11) NOT NULL,
  INDEX `fk_Supplier_has_Product_Product1_idx` (`Product_Product_id` ASC),
  INDEX `supplier_Contact_id_idx` (`Supplier_Contact_id` ASC),
  PRIMARY KEY (`Supplier_Contact_id`, `Product_Product_id`),
  CONSTRAINT `fk_Supplier_has_Product_Product1`
    FOREIGN KEY (`Product_Product_id`)
    REFERENCES `e-commerce_database`.`product` (`Product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `supplier_Contact_id`
    FOREIGN KEY (`Supplier_Contact_id`)
    REFERENCES `e-commerce_database`.`supplier_contact` (`ContactId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `e-commerce_database` ;

Insert into Category values(100,'Electronics');
Insert into Category(Category_Name) values('Furniture');
select * from category;

Insert into SubCategory(SubCategory_id,SubCategoryName,Category_id) values(200,'Phones',100);
Insert into SubCategory(SubCategoryName,Category_id) values('Television',100);
Insert into SubCategory(SubCategoryName,Category_id) values('Table',102);
Insert into SubCategory(SubCategoryName,Category_id) values('Chairs',102);
select* from subcategory;

select * from manufacturer;
insert into manufacturer values(151,'Google');
insert into manufacturer values(200,'Woodcraft');
insert into manufacturer values(201,'Crafters');


Insert into Product(Product_Name,Product_description,Product_Catalog_id,Manufacturer_id,Price) values('Dinning Table','For 6 people',203,200,230);
INSERT INTO Product(Product_Name,Product_description,Product_Catalog_id,Manufacturer_id,Price) VALUES ('1004', 'Dinning Chairs', 'Memory Foam', '204', '201', '32');
INSERT INTO Product(Product_Name,Product_description,Product_Catalog_id,Manufacturer_id,Price) VALUES ('1005', 'Pixel XL', '256 GB', '200', '151', '1320');
INSERT INTO Product(Product_Name,Product_description,Product_Catalog_id,Manufacturer_id,Price) VALUES ('1006', 'Pixel ', '128', '200', '151', '1080');

select * from product;



INSERT INTO `e-commerce_database`.`product_details` (idProduct_Details, Size, Colour, Availablity, Discount_Available, Product_Product_id) VALUES ('2010', '56*21', 'Black', 'Yes', '21', '1005');
INSERT INTO `e-commerce_database`.`product_details` (`idProduct_Details`, `Size`, `Colour`, `Availablity`, `Discount_Available`, `Product_Product_id`) VALUES ('2011', '46*21', 'Grey', 'Yes', '6', '1006');
INSERT INTO `e-commerce_database`.`product_details` (`idProduct_Details`, `Size`, `Colour`, `Availablity`, `Discount_Available`, `Product_Product_id`) VALUES ('2012', '109*130', 'Wooden', 'Yes', '34', '1003');
INSERT INTO `e-commerce_database`.`product_details` (`idProduct_Details`, `Size`, `Colour`, `Availablity`, `Discount_Available`, `Product_Product_id`) VALUES ('2013', '67*45', 'Wooden', 'Yes', '25', '1004');
INSERT INTO `e-commerce_database`.`product_details` (`idProduct_Details`, `Size`, `Colour`, `Availablity`, `Discount_Available`, `Product_Product_id`) VALUES ('2014', '48 inches', 'Black', 'Yes', '30', '1007');

update product_details set Availablity ='Sold' where idProduct_Details=2000;
select * from product_details;

insert into customer_has_address values(5000,20006);
INSERT INTO `e-commerce_database`.`customer_has_address` (`Customer_Customer_id`, `Address_Address_id`) VALUES ('5005', '20007');
INSERT INTO `e-commerce_database`.`customer_has_address` (`Customer_Customer_id`, `Address_Address_id`) VALUES ('5006', '20007');
INSERT INTO `e-commerce_database`.`customer_has_address` (`Customer_Customer_id`, `Address_Address_id`) VALUES ('5007', '20007');

select * from customer_has_address;
select* from customer;
select * from customer inner join customer_has_address on customer.Customer_id= customer_has_address.Customer_Customer_id 
inner join address on address.Address_id= customer_has_address.Address_Address_id;
select * from payment_option;
insert into payment_option(Transaction_Status,Customer_id,Payment_date) values('Pending',5004,curdate());
insert into cardtype values('CC','Undertaker Deshmukh','Bank of America','03','2021','9008768234566565',300);
insert into cardtype values('DC','Kane Sawardekar','Santander Bank','05','2020','9008768298610987',301);
insert into cardtype values('CC','Lita Dalvi','Santander Bank','09','2022','9878768296180987',302);
INSERT INTO `e-commerce_database`.`cardType` (`Type_Card`, `Card_Holder_Name`, `Bank_Name`, `Exp_Month`, `Exp_Year`, `Card_Number`, `Payment_Option_payment_id`) VALUES ('DC', 'Kaushal Chaudhary', 'Bank of America', '03', '2023', '9800768234657123', '303');
INSERT INTO `e-commerce_database`.`cardType` (`Type_Card`, `Card_Holder_Name`, `Bank_Name`, `Exp_Month`, `Exp_Year`, `Card_Number`, `Payment_Option_payment_id`) VALUES ('CC', 'Kaushal Chaudhary', 'Bank of America', '06', '2023', '9845678912436754', '303');
select * from cardType;
select * from payment_option inner join cardtype on payment_option.payment_id= cardtype.Payment_Option_payment_id;

insert into address(Address_id,Line_1,Line_2,City,State,ZIP,Country) values(21000,'#4 145 Bolyston','Huntington Ave','Boston','MA',02120,'USA');
insert into address(Address_id,Line_1,Line_2,City,State,ZIP,Country) values(20006,'#1 15 Hemenway','Fenway Park','Boston','MA',02120,'USA');
insert into address(Address_id,Line_1,Line_2,City,State,ZIP,Country) values(20005,'#5 425 Fenway','Huntington Ave','Boston','MA',02120,'USA');
INSERT INTO `e-commerce_database`.`address` (`Address_id`, `Line_1`, `Line_2`, `City`, `State`, `ZIP`, `Country`) VALUES ('20007', '#14 Huntington Ave', 'Cambridge st', 'Boston', 'MA', '2014', 'USA');
INSERT INTO `e-commerce_database`.`address` (`Address_id`, `Line_1`, `Line_2`, `City`, `State`, `ZIP`, `Country`) VALUES ('20011', '#1 56 RockVille', 'Mass Ave', 'Boston', 'MA', '2056', 'USA');
INSERT INTO `e-commerce_database`.`address` (`Address_id`, `Line_1`, `Line_2`, `City`, `State`, `ZIP`, `Country`) VALUES ('20014', '#88 Cunard St', 'Columbus Ave', 'Boston', 'MA', '20120', 'USA');
INSERT INTO `e-commerce_database`.`address` (`Address_id`, `Line_1`, `Line_2`, `City`, `State`, `ZIP`, `Country`) VALUES ('20015', '#76 145 Bolyston', 'Columbus Ave', 'Boston', 'MA', '20120', 'USA');
INSERT INTO `e-commerce_database`.`address` (`Address_id`, `Line_1`, `Line_2`, `City`, `State`, `ZIP`, `Country`) VALUES ('2016', '#78 657 Fenway', 'Fenway Park', 'Boston', 'MA ', '2561', 'USA');

select * from address;

insert into Supplier values(001,'Hindal Co','www,hindalco.com',21000);
INSERT INTO `e-commerce_database`.`supplier` (`Supplier_Id`, `CompanyName`, `URL`, `Address_Address_id`, `phone_number`, `email-id`) VALUES ('3', 'WoodMart', 'www.woodmart.com', '20014', '987695438', 'woodmart@gmail.com');

Select * from supplier;

insert into supplier_contact values (50,'Rock','Ghag','34','Male',1);
insert into supplier_contact values (51,'Shawn','Ghatawdekar','41','Male',1);
select * from supplier_contact;

select CompanyName,Contact_fName,Contact_lName from Supplier inner Join supplier_contact ;

insert into supplier_contact_has_address values (50,20005); 
INSERT INTO `e-commerce_database`.`supplier_contact_has_address` (`Supplier_Contact_ContactId`, `Address_Address_id`) VALUES ('52', '20015');
INSERT INTO `e-commerce_database`.`supplier_contact_has_address` (`Supplier_Contact_ContactId`, `Address_Address_id`) VALUES ('53', '20016');
INSERT INTO `e-commerce_database`.`supplier_contact_has_address` (`Supplier_Contact_ContactId`, `Address_Address_id`) VALUES ('51', '20005');

select * from supplier_contact_has_address;
select contact_fName,Line_1,Line_2,City,State,Zip,Country from supplier_contact inner join supplier_contact_has_address on supplier_contact_contactid= contactid inner join address on Address_address_id=address_id;

insert into supply values(1000,10,'2017-03-21',50);
insert into supply values(1002,8,'2016-03-10',51);
INSERT INTO `e-commerce_database`.`supplier_contact` (`ContactId`, `Contact_fName`, `Contact_lName`, `Age`, `Gender`, `Supplier_id`, `phone_number`, `email-id`) VALUES ('52', 'Aditya', 'Pawar', '22', 'Male', '2', '9806578791', 'a.pawar@gmail.com');
INSERT INTO `e-commerce_database`.`supplier_contact` (`ContactId`, `Contact_fName`, `Contact_lName`, `Age`, `Gender`, `Supplier_id`, `phone_number`, `email-id`) VALUES ('53', 'Pranav', 'Waimbe', '23', 'Male', '3', '9807686725', 'p.walimbe@gmail.com');
INSERT INTO `e-commerce_database`.`supply` (`Product_Product_id`, `quantity`, `Supply_Date`, `Supplier_Contact_id`) VALUES ('1003', '12', '2017-09-11', '53');
INSERT INTO `e-commerce_database`.`supply` (`Product_Product_id`, `quantity`, `Supply_Date`, `Supplier_Contact_id`) VALUES ('1004', '32', '2017-10-19', '53');
INSERT INTO `e-commerce_database`.`supply` (`Product_Product_id`, `quantity`, `Supply_Date`, `Supplier_Contact_id`) VALUES ('1005', '6', '2017-10-12', '51');
UPDATE `e-commerce_database`.`supply` SET `Supplier_Contact_id`='50' WHERE `Product_Product_id`='1002';
INSERT INTO `e-commerce_database`.`supply` (`Product_Product_id`, `quantity`, `Supply_Date`, `Supplier_Contact_id`) VALUES ('1006', '18', '2017-08-14', '51');
INSERT INTO `e-commerce_database`.`supply` (`Product_Product_id`, `quantity`, `Supply_Date`, `Supplier_Contact_id`) VALUES ('1007', '10', '2017-08-10', '52');

select * from supply;

insert into billing_details values(9000,'2017-12-10',20000);
insert into billing_details values(9001,'2017-12-10',20002);
INSERT INTO `e-commerce_database`.`billing_details` (`Billing_Id`, `Billing_Date`, `Address_Address_id`) VALUES ('9002', '2017-12-09', '20001');
INSERT INTO `e-commerce_database`.`billing_details` (`Billing_Id`, `Billing_Date`, `Address_Address_id`) VALUES ('9003', '2017-12-08', '20007');
INSERT INTO `e-commerce_database`.`billing_details` (`Billing_Id`, `Billing_Date`, `Address_Address_id`) VALUES ('9004', '2017-12-11', '20007');
select * from billing_details;

insert into address(Address_id,Line_1,Line_2,City,State,ZIP,Country) values(20010,'#1 257 Bedford st','Carolina Ave','Boston','MA',02111,'USA');

insert into delivery_boy values(200,'Rusuv','Rao','24','Male');
insert into delivery_boy_has_address values(200,20010);
select* from delivery_boy;

insert into shipping_details values(400,curdate(),20006,200);
insert into shipping_details values(401,curdate(),20002,200);
INSERT INTO `e-commerce_database`.`shipping_details` (`Shipper_id`, `ShippingDate`, `Address_id`, `idDelivery_Boy`) VALUES ('402', '2017-12-11', '20001', '200');
INSERT INTO `e-commerce_database`.`shipping_details` (`Shipper_id`, `ShippingDate`, `Address_id`, `idDelivery_Boy`) VALUES ('403', '2017-12-11', '20007', '200');
INSERT INTO `e-commerce_database`.`shipping_details` (`Shipper_id`, `ShippingDate`, `Address_id`, `idDelivery_Boy`) VALUES ('404', '2017-12-11', '20007', '200');

select * from shipping_details;

insert into order_table values(6000,2009,curdate(),400,9000,300,9008768234566565);
insert into order_table values(6001,2007,curdate(),401,9001,302,9878768296180987,3);
INSERT INTO `e-commerce_database`.`order_table` (`Order_Id`, `ProductDetails_id`, `OrderDate`, `ShipperID`, `BillingID`, `cardtype_Payment_Option_payment_id`, `cardtype_Card_Number`, `quantity`) VALUES ('6002', '2012', '2017-12-11', '402', '9002', '301', '9008768298610987', '1');
INSERT INTO `e-commerce_database`.`order_table` (`Order_Id`, `ProductDetails_id`, `OrderDate`, `ShipperID`, `BillingID`, `cardtype_Payment_Option_payment_id`, `cardtype_Card_Number`, `quantity`) VALUES ('6003', '2010', '2017-12-10', '403', '9003', '303', '9800768234657123', '6');
INSERT INTO `e-commerce_database`.`order_table` (`Order_Id`, `ProductDetails_id`, `OrderDate`, `ShipperID`, `BillingID`, `cardtype_Payment_Option_payment_id`, `cardtype_Card_Number`, `quantity`) VALUES ('6004', '2013', '2017-12-11', '402', '9002', '301', '9008768298610987', '6');

select * from order_table;


-- create View 
create View bill_Detals as
select Order_id,Orderdate,Manufacturer_Name,Product_Name,Product_description,Quantity,Price,Discount_Available,((Price-(Price*Discount_Available )/100)*quantity)as Total from Order_table 
inner join product_details on product_details.idProduct_Details= Order_table.ProductDetails_id 
inner join product on product_details.product_product_id= product.product_id
inner join manufacturer on Product.manufacturer_id=Manufacturer.manufacturer_id; 


create view customer_details as
select order_id,Orderdate,cardtype_card_number,First_name,Last_Name from order_table 
inner join cardtype on order_table.cardtype_Card_Number= cardtype.Card_Number 
inner join payment_option on Payment_Option_payment_id= payment_option.payment_id 
inner join customer on payment_option.Customer_Id= customer.Customer_id;

create view customer_order as
select concat_ws('  ',First_Name,Last_Name) as Customer_Name,emailid,cardtype.Card_Number,cardtype.Bank_Name,order_table.Order_Id,product_details.Colour,product.Product_Name,product.Product_description,manufacturer.Manufacturer_Name
From manufacturer inner join product on product.Manufacturer_id= manufacturer.Manufacturer_id
inner join product_details on product_details.Product_Product_id= product.Product_id
inner join order_table on order_table.ProductDetails_id= product_details.idProduct_Details
inner join cardtype on cardtype.Card_Number = order_table.cardtype_Card_Number
inner join payment_option on payment_option.payment_id= cardtype.Payment_Option_payment_id
inner join customer on customer.Customer_id = payment_option.Customer_Id;

create view supplier_details as
Select CompanyName,concat_ws('  ',contact_fname,contact_lname),Supply_date,Product_Name,Product_Description, Manufacturer_Name From manufacturer 
Inner Join product on Product.manufacturer_id= Manufacturer.Manufacturer_id 
inner join supply on Product.product_id = Supply.product_product_id 
inner join supplier_contact on Supplier_Contact_id= contactid
inner join supplier on Supplier.supplier_id=supplier_contact.Supplier_id;

select * from bill_detals ;
select * from supplier_details;
select * from customer_details;
select * from customer_order;

-- Create Users
create user 'Product_Manager' @'localhost' identified by 'pmanagerr';
grant insert on product_details to 'Product_Manager'@'localhost';
grant select on product_details to 'Product_Manager'@'localhost';
grant insert on product to 'Product_Manager'@'localhost';
grant select on product to 'Product_Manager'@'localhost';
grant update on product_details to 'Product_Manager'@'localhost'; 
grant update on product to 'Product_Manager'@'localhost';
grant insert on Category to 'Product_Manager'@'localhost';
grant update on Category to 'Product_Manager'@'localhost';
grant select on Category to 'Product_Manager'@'localhost';
grant insert on SubCategory to 'Product_Manager'@'localhost';  
grant select on SubCategory to 'Product_Manager'@'localhost';  
grant update on SubCategory to 'Product_Manager'@'localhost';
grant update on Manufacturer to 'Product_Manager'@'localhost';
grant insert on Manufacturer to 'Product_Manager'@'localhost';
grant select on Manufacturer to 'Product_Manager'@'localhost';  
revoke all, grant option from 'Product_Manager'@'localhost'; 

-- Create Triggers
CREATE TABLE`E-Commerce_Database`.`Product_Details_Backup` (
  `userName` varchar(33),
   `System Date` Date,
  `idProduct_Details` INT ,
  `Size` VARCHAR(45) ,
  `Colour` VARCHAR(45),
  `Availablity` VARCHAR(45),
  `Discount_Available` VARCHAR(45),
  `Product_Product_id` INT); 
  
CREATE TABLE IF NOT EXISTS `E-Commerce_Database`.`Product_Backup` (
  `userName` varchar(33),
   `System Date` Date,
  `Product_id` INT,
  `Product_Name` VARCHAR(45) ,
  `Product_description` VARCHAR(45) ,
  `Product_Catalog_id` INT ,
  `Manufacturer_id` INT 
);
Delimiter %

Create trigger backup_data_product
after insert on product
for each row
begin
insert into product_backup
values(user(),sysdate(),new.Product_id,new.Product_Name,new.Product_description,new.Product_catalog_id,new.Manufacturer_id);
end;%

Delimiter %

Create trigger backup_data_product_details
after update on product_details
for each row
begin
insert into product_details_backup
values(user(),sysdate(),old.idProduct_Details,old.size,old.colour,old.availablity,old.Discount_Available,old.product_product_id);
end;%

select * from product_details_backup;
select * from product_backup;

Delimiter %
create procedure total_sales_per_day(in date_order date)
Begin
select Orderdate,sum((Price-(Price*Discount_Available )/100)*quantity)as Total from Order_table 
inner join product_details on product_details.idProduct_Details= Order_table.ProductDetails_id 
inner join product on product_details.product_product_id= product.product_id
inner join manufacturer on Product.manufacturer_id=Manufacturer.manufacturer_id
where order_table.orderdate = date_order
group by orderdate with rollup; 
end;%

call total_sales_per_day('2017-12-10');

Delimiter %
create procedure update_product_details(In id int)
Begin
update product_details
set availablity = 'Sold'
where product_details.idProduct_Details =id;
end;%




call update_product_details(2005);






