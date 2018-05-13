CREATE DATABASE  IF NOT EXISTS `e-commerce_database` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `e-commerce_database`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: e-commerce_database
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `Address_id` int(11) NOT NULL,
  `Line_1` varchar(45) NOT NULL,
  `Line_2` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `State` varchar(45) NOT NULL,
  `ZIP` int(11) NOT NULL,
  `Country` varchar(45) NOT NULL,
  PRIMARY KEY (`Address_id`),
  UNIQUE KEY `Address_id_UNIQUE` (`Address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (20000,'#9 31 Cunard st','Columbus Ave','Boston','MA',2120,'USA'),(20001,'#11 32 Cunard st','Columbus Ave','Boston','MA',2120,'USA'),(20002,'#11 35 Bolyston st','Columbus Ave','Boston','MA',2120,'USA'),(20005,'#5 425 Fenway','Huntington Ave','Boston','MA',2120,'USA'),(20006,'#1 15 Hemenway','Fenway Park','Boston','MA',2120,'USA'),(20007,'#14 Huntington Ave','Cambridge st','Boston','MA',2014,'USA'),(20010,'#1 257 Bedford st','Carolina Ave','Boston','MA',2111,'USA'),(20011,'#1 56 RockVille','Mass Ave','Boston','MA',2056,'USA'),(20012,'#54 Columbia','Missiion Main','Boston','MA',2031,'USA'),(20013,'#56 Fenway','MissionHill','Boston','MA',2019,'USA'),(20014,'#88 Cunard St','Columbus Ave','Boston','MA',20120,'USA'),(20015,'#76 145 Bolyston','Columbus Ave','Boston','MA',20120,'USA'),(20016,'#78 657 Fenway','Fenway Park','Boston','MA ',2561,'USA'),(21000,'#4 145 Bolyston','Huntington Ave','Boston','MA',2120,'USA');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `bill_detals`
--

DROP TABLE IF EXISTS `bill_detals`;
/*!50001 DROP VIEW IF EXISTS `bill_detals`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `bill_detals` AS SELECT 
 1 AS `Order_id`,
 1 AS `Manufacturer_Name`,
 1 AS `Product_Name`,
 1 AS `Product_description`,
 1 AS `Quantity`,
 1 AS `Price`,
 1 AS `Discount_Available`,
 1 AS `Total`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `billing_details`
--

DROP TABLE IF EXISTS `billing_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing_details` (
  `Billing_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Billing_Date` date NOT NULL,
  `Address_Address_id` int(11) NOT NULL,
  PRIMARY KEY (`Billing_Id`,`Address_Address_id`),
  UNIQUE KEY `Billing_Id_UNIQUE` (`Billing_Id`),
  KEY `fk_Billing_Details_Address1_idx` (`Address_Address_id`),
  CONSTRAINT `fk_Billing_Details_Address1` FOREIGN KEY (`Address_Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9005 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing_details`
--

LOCK TABLES `billing_details` WRITE;
/*!40000 ALTER TABLE `billing_details` DISABLE KEYS */;
INSERT INTO `billing_details` VALUES (9000,'2017-12-10',20000),(9001,'2017-12-10',20002),(9002,'2017-12-09',20001),(9003,'2017-12-08',20007),(9004,'2017-12-11',20007);
/*!40000 ALTER TABLE `billing_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardtype`
--

DROP TABLE IF EXISTS `cardtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardtype` (
  `Type_Card` enum('CC','DC') NOT NULL,
  `Card_Holder_Name` varchar(45) NOT NULL,
  `Bank_Name` varchar(45) NOT NULL,
  `Exp_Month` varchar(45) NOT NULL,
  `Exp_Year` varchar(45) NOT NULL,
  `Card_Number` varchar(16) NOT NULL,
  `Payment_Option_payment_id` int(11) NOT NULL,
  PRIMARY KEY (`Payment_Option_payment_id`,`Card_Number`),
  KEY `fk_CardType_Payment_Option1_idx` (`Payment_Option_payment_id`),
  CONSTRAINT `fk_CardType_Payment_Option1` FOREIGN KEY (`Payment_Option_payment_id`) REFERENCES `payment_option` (`payment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardtype`
--

LOCK TABLES `cardtype` WRITE;
/*!40000 ALTER TABLE `cardtype` DISABLE KEYS */;
INSERT INTO `cardtype` VALUES ('CC','Undertaker Deshmukh','Bank of America','03','2021','9008768234566565',300),('DC','Kane Sawardekar','Santander Bank','05','2020','9008768298610987',301),('CC','Lita Dalvi','Santander Bank','09','2022','9878768296180987',302),('DC','Kaushal Chaudhary','Bank of America','03','2023','9800768234657123',303),('CC','Kaushal Chaudhary','Bank of America','06','2023','9845678912436754',303);
/*!40000 ALTER TABLE `cardtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `Category_id` int(11) NOT NULL AUTO_INCREMENT,
  `Category_Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Category_id`),
  UNIQUE KEY `idCategory_UNIQUE` (`Category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (100,'Electronics'),(102,'Furniture');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `Customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Age` tinyint(10) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `phone_id` varchar(15) DEFAULT NULL,
  `emailid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Customer_id`),
  UNIQUE KEY `Customer_id_UNIQUE` (`Customer_id`),
  KEY `Phone_id_idx` (`phone_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5008 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (5000,'Undertaker','Deshmukh',42,'Male','8765469876','undertaker.Deshmukh@gmail.com'),(5003,'Kane','Sawardekar',44,'Male','8645671432','kane.s@gmail.com'),(5004,'Lita','Dalvi',31,'Female','9987689543','l.dalvi@yahoo.com'),(5005,'Kaushal','Chaudhary',23,'Male','8572699562','kau.c@gmail.com'),(5006,'Gauresh','Chavan',22,'Male','8572699786','g.chavan@gmail.com'),(5007,'Mohit','Ruke',23,'Male','8769870979','mruke@gmail.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `customer_details`
--

DROP TABLE IF EXISTS `customer_details`;
/*!50001 DROP VIEW IF EXISTS `customer_details`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `customer_details` AS SELECT 
 1 AS `order_id`,
 1 AS `Orderdate`,
 1 AS `cardtype_card_number`,
 1 AS `First_name`,
 1 AS `Last_Name`,
 1 AS `Line_1`,
 1 AS `Line_2`,
 1 AS `City`,
 1 AS `State`,
 1 AS `Zip`,
 1 AS `Country`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `customer_has_address`
--

DROP TABLE IF EXISTS `customer_has_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_has_address` (
  `Customer_Customer_id` int(11) NOT NULL,
  `Address_Address_id` int(11) NOT NULL,
  PRIMARY KEY (`Customer_Customer_id`,`Address_Address_id`),
  KEY `fk_Customer_has_Address_Address1_idx` (`Address_Address_id`),
  KEY `fk_Customer_has_Address_Customer1_idx` (`Customer_Customer_id`),
  CONSTRAINT `fk_Customer_has_Address_Address1` FOREIGN KEY (`Address_Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_has_Address_Customer1` FOREIGN KEY (`Customer_Customer_id`) REFERENCES `customer` (`Customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_has_address`
--

LOCK TABLES `customer_has_address` WRITE;
/*!40000 ALTER TABLE `customer_has_address` DISABLE KEYS */;
INSERT INTO `customer_has_address` VALUES (5000,20001),(5003,20001),(5004,20002),(5000,20006),(5005,20007),(5006,20007),(5007,20007);
/*!40000 ALTER TABLE `customer_has_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!50001 DROP VIEW IF EXISTS `customer_order`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `customer_order` AS SELECT 
 1 AS `Customer_Name`,
 1 AS `emailid`,
 1 AS `Card_Number`,
 1 AS `Bank_Name`,
 1 AS `Order_Id`,
 1 AS `Colour`,
 1 AS `Product_Name`,
 1 AS `Product_description`,
 1 AS `Manufacturer_Name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `delivery_boy`
--

DROP TABLE IF EXISTS `delivery_boy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery_boy` (
  `idDelivery_Boy` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `email-id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDelivery_Boy`),
  UNIQUE KEY `idDelivery_Boy_UNIQUE` (`idDelivery_Boy`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_boy`
--

LOCK TABLES `delivery_boy` WRITE;
/*!40000 ALTER TABLE `delivery_boy` DISABLE KEYS */;
INSERT INTO `delivery_boy` VALUES (200,'Rusuv','Rao',24,'Male','8974561456','rusev.r@gmail.com');
/*!40000 ALTER TABLE `delivery_boy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_boy_has_address`
--

DROP TABLE IF EXISTS `delivery_boy_has_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery_boy_has_address` (
  `Delivery_Boy_idDelivery_Boy` int(11) NOT NULL,
  `Address_Address_id` int(11) NOT NULL,
  PRIMARY KEY (`Delivery_Boy_idDelivery_Boy`,`Address_Address_id`),
  KEY `fk_Delivery_Boy_has_Address_Address1_idx` (`Address_Address_id`),
  KEY `fk_Delivery_Boy_has_Address_Delivery_Boy1_idx` (`Delivery_Boy_idDelivery_Boy`),
  CONSTRAINT `fk_Delivery_Boy_has_Address_Address1` FOREIGN KEY (`Address_Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Delivery_Boy_has_Address_Delivery_Boy1` FOREIGN KEY (`Delivery_Boy_idDelivery_Boy`) REFERENCES `delivery_boy` (`idDelivery_Boy`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_boy_has_address`
--

LOCK TABLES `delivery_boy_has_address` WRITE;
/*!40000 ALTER TABLE `delivery_boy_has_address` DISABLE KEYS */;
INSERT INTO `delivery_boy_has_address` VALUES (200,20010);
/*!40000 ALTER TABLE `delivery_boy_has_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manufacturer`
--

DROP TABLE IF EXISTS `manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manufacturer` (
  `Manufacturer_id` int(11) NOT NULL DEFAULT '150',
  `Manufacturer_Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Manufacturer_id`),
  UNIQUE KEY `Manufacturer_id_UNIQUE` (`Manufacturer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manufacturer`
--

LOCK TABLES `manufacturer` WRITE;
/*!40000 ALTER TABLE `manufacturer` DISABLE KEYS */;
INSERT INTO `manufacturer` VALUES (150,'Apple'),(151,'Google'),(152,'Samsung'),(200,'Woodcraft'),(201,'Crafters');
/*!40000 ALTER TABLE `manufacturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_table`
--

DROP TABLE IF EXISTS `order_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_table` (
  `Order_Id` int(11) NOT NULL AUTO_INCREMENT,
  `ProductDetails_id` int(11) NOT NULL,
  `OrderDate` date NOT NULL,
  `ShipperID` int(11) NOT NULL,
  `BillingID` int(11) NOT NULL,
  `cardtype_Payment_Option_payment_id` int(11) NOT NULL,
  `cardtype_Card_Number` varchar(16) NOT NULL,
  `quantity` int(10) NOT NULL,
  PRIMARY KEY (`Order_Id`,`ProductDetails_id`,`ShipperID`,`BillingID`,`cardtype_Payment_Option_payment_id`,`cardtype_Card_Number`),
  UNIQUE KEY `Order_Id_UNIQUE` (`Order_Id`),
  KEY `Shipper_id_idx` (`ShipperID`),
  KEY `Billing_Id_idx` (`BillingID`),
  KEY `Product_id_idx` (`ProductDetails_id`),
  KEY `fk_order_cardtype1_idx` (`cardtype_Payment_Option_payment_id`,`cardtype_Card_Number`),
  CONSTRAINT `Billing_Id` FOREIGN KEY (`BillingID`) REFERENCES `billing_details` (`Billing_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Product_id` FOREIGN KEY (`ProductDetails_id`) REFERENCES `product_details` (`idProduct_Details`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Shipper_id` FOREIGN KEY (`ShipperID`) REFERENCES `shipping_details` (`Shipper_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_cardtype1` FOREIGN KEY (`cardtype_Payment_Option_payment_id`, `cardtype_Card_Number`) REFERENCES `cardtype` (`Payment_Option_payment_id`, `Card_Number`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6005 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_table`
--

LOCK TABLES `order_table` WRITE;
/*!40000 ALTER TABLE `order_table` DISABLE KEYS */;
INSERT INTO `order_table` VALUES (6000,2009,'2017-12-11',400,9000,300,'9008768234566565',2),(6001,2007,'2017-12-11',401,9001,302,'9878768296180987',3),(6002,2012,'2017-12-11',402,9002,301,'9008768298610987',1),(6003,2010,'2017-12-10',403,9003,303,'9800768234657123',6),(6004,2013,'2017-12-11',402,9002,301,'9008768298610987',6);
/*!40000 ALTER TABLE `order_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_option`
--

DROP TABLE IF EXISTS `payment_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_option` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `Transaction_Status` enum('Completed','Pending') NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Payment_Date` date NOT NULL,
  PRIMARY KEY (`payment_id`,`Customer_Id`),
  UNIQUE KEY `payment_id_UNIQUE` (`payment_id`),
  KEY `Customer_id_idx` (`Customer_Id`),
  CONSTRAINT `Customer_id` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`Customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_option`
--

LOCK TABLES `payment_option` WRITE;
/*!40000 ALTER TABLE `payment_option` DISABLE KEYS */;
INSERT INTO `payment_option` VALUES (300,'Completed',5000,'2017-12-10'),(301,'Completed',5003,'2017-12-08'),(302,'Pending',5004,'2017-12-11'),(303,'Completed',5005,'2017-12-11');
/*!40000 ALTER TABLE `payment_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `Product_id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(45) NOT NULL,
  `Product_description` varchar(45) NOT NULL,
  `Product_Catalog_id` int(11) NOT NULL,
  `Manufacturer_id` int(11) NOT NULL,
  `Price` double NOT NULL,
  PRIMARY KEY (`Product_id`,`Manufacturer_id`,`Product_Catalog_id`),
  UNIQUE KEY `idProduct_UNIQUE` (`Product_id`),
  KEY `Product_Catalog_id_idx` (`Product_Catalog_id`),
  KEY `Manufacturer_id_idx` (`Manufacturer_id`),
  CONSTRAINT `Manufacturer_id` FOREIGN KEY (`Manufacturer_id`) REFERENCES `manufacturer` (`Manufacturer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Product_Catalog_id` FOREIGN KEY (`Product_Catalog_id`) REFERENCES `subcategory` (`SubCategory_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1000,'I-Phone X','64 GB ',200,150,999),(1002,'I-Phone X','256 GB',200,150,1420),(1003,'Dinning Table','For 6 people',203,200,230),(1004,'Dinning Chairs','Memory Foam',204,201,32),(1005,'Pixel XL','256 GB',200,151,1320),(1006,'Pixel ','128 GB',200,151,1080),(1007,'OLED TV','4k Pixels',202,152,890),(1008,'Wooden Wardrobe','Good Quality Drawer',203,200,670);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger backup_data_product
after insert on product
for each row
begin
insert into product_backup
values(user(),sysdate(),new.Product_id,new.Product_Name,new.Product_description,new.Product_catalog_id,new.Manufacturer_id);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `product_backup`
--

DROP TABLE IF EXISTS `product_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_backup` (
  `userName` varchar(33) DEFAULT NULL,
  `System Date` date DEFAULT NULL,
  `Product_id` int(11) DEFAULT NULL,
  `Product_Name` varchar(45) DEFAULT NULL,
  `Product_description` varchar(45) DEFAULT NULL,
  `Product_Catalog_id` int(11) DEFAULT NULL,
  `Manufacturer_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_backup`
--

LOCK TABLES `product_backup` WRITE;
/*!40000 ALTER TABLE `product_backup` DISABLE KEYS */;
INSERT INTO `product_backup` VALUES ('Product_Manager@localhost','2017-12-13',1008,'Wooden Wardrobe','Good Quality Drawer',203,200);
/*!40000 ALTER TABLE `product_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_details`
--

DROP TABLE IF EXISTS `product_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_details` (
  `idProduct_Details` int(11) NOT NULL AUTO_INCREMENT,
  `Size` varchar(45) NOT NULL,
  `Colour` varchar(45) NOT NULL,
  `Availablity` varchar(45) NOT NULL,
  `Discount_Available` varchar(45) NOT NULL,
  `Product_Product_id` int(11) NOT NULL,
  PRIMARY KEY (`idProduct_Details`,`Product_Product_id`),
  UNIQUE KEY `idProduct_Details_UNIQUE` (`idProduct_Details`),
  KEY `fk_Product_Details_Product1_idx` (`Product_Product_id`),
  CONSTRAINT `fk_Product_Details_Product1` FOREIGN KEY (`Product_Product_id`) REFERENCES `product` (`Product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2015 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_details`
--

LOCK TABLES `product_details` WRITE;
/*!40000 ALTER TABLE `product_details` DISABLE KEYS */;
INSERT INTO `product_details` VALUES (2000,'42*32','Jet Black','Yes','10',1000),(2005,'42*32','Blue','Sold','15',1000),(2007,'42*32','Jet Black','Sold','18',1002),(2008,'42*32','Jet Black','Yes','9',1002),(2009,'42*32','Silver ','Sold','11',1002),(2010,'56*21','Black','Sold','21',1005),(2011,'46*21','Grey','Yes','6',1006),(2012,'109*130','Wooden','Sold','34',1003),(2013,'67*45','Wooden','Sold','25',1004),(2014,'48 inches','Black','Yes','30',1007);
/*!40000 ALTER TABLE `product_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger backup_data_product_details
after update on product_details
for each row
begin
insert into product_details_backup
values(user(),sysdate(),old.idProduct_Details,old.size,old.colour,old.availablity,old.Discount_Available,old.product_product_id);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `product_details_backup`
--

DROP TABLE IF EXISTS `product_details_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_details_backup` (
  `userName` varchar(33) DEFAULT NULL,
  `System Date` date DEFAULT NULL,
  `idProduct_Details` int(11) DEFAULT NULL,
  `Size` varchar(45) DEFAULT NULL,
  `Colour` varchar(45) DEFAULT NULL,
  `Availablity` varchar(45) DEFAULT NULL,
  `Discount_Available` varchar(45) DEFAULT NULL,
  `Product_Product_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_details_backup`
--

LOCK TABLES `product_details_backup` WRITE;
/*!40000 ALTER TABLE `product_details_backup` DISABLE KEYS */;
INSERT INTO `product_details_backup` VALUES ('Product_Manager@localhost','2017-12-12',2005,'42*32','Blue','Sold','15',1000),('root@localhost','2017-12-13',2007,'42*32','Jet Black','Yes','18',1002),('root@localhost','2017-12-13',2000,'42*32','Jet Black','Sold','10',1000),('root@localhost','2017-12-13',2010,'56*21','Black','Yes','21',1005),('root@localhost','2017-12-13',2012,'109*130','Wooden','Yes','34',1003),('root@localhost','2017-12-13',2013,'67*45','Wooden','Yes','25',1004),('root@localhost','2017-12-13',2005,'42*32','Blue','Yes','15',1000),('root@localhost','2017-12-13',2010,'56*21','Black','Sold','21',1005);
/*!40000 ALTER TABLE `product_details_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping_details`
--

DROP TABLE IF EXISTS `shipping_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipping_details` (
  `Shipper_id` int(11) NOT NULL AUTO_INCREMENT,
  `ShippingDate` date NOT NULL,
  `Address_id` int(11) NOT NULL,
  `idDelivery_Boy` int(11) NOT NULL,
  PRIMARY KEY (`Shipper_id`,`Address_id`,`idDelivery_Boy`),
  UNIQUE KEY `Shipper_id_UNIQUE` (`Shipper_id`),
  KEY `Address_id_idx` (`Address_id`),
  KEY `idDelivery_Boy_idx` (`idDelivery_Boy`),
  CONSTRAINT `Address_id` FOREIGN KEY (`Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idDelivery_Boy` FOREIGN KEY (`idDelivery_Boy`) REFERENCES `delivery_boy` (`idDelivery_Boy`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_details`
--

LOCK TABLES `shipping_details` WRITE;
/*!40000 ALTER TABLE `shipping_details` DISABLE KEYS */;
INSERT INTO `shipping_details` VALUES (400,'2017-12-11',20006,200),(401,'2017-12-11',20002,200),(402,'2017-12-11',20001,200),(403,'2017-12-11',20007,200),(404,'2017-12-11',20007,200);
/*!40000 ALTER TABLE `shipping_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategory`
--

DROP TABLE IF EXISTS `subcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcategory` (
  `SubCategory_id` int(11) NOT NULL AUTO_INCREMENT,
  `SubCategoryName` varchar(45) NOT NULL,
  `Category_id` int(11) NOT NULL,
  PRIMARY KEY (`SubCategory_id`,`Category_id`),
  UNIQUE KEY `idSubCategory_UNIQUE` (`SubCategory_id`),
  KEY `Category_id_idx` (`Category_id`),
  CONSTRAINT `Category_id` FOREIGN KEY (`Category_id`) REFERENCES `category` (`Category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategory`
--

LOCK TABLES `subcategory` WRITE;
/*!40000 ALTER TABLE `subcategory` DISABLE KEYS */;
INSERT INTO `subcategory` VALUES (200,'Phones',100),(202,'Television',100),(203,'Table',102),(204,'Chairs',102);
/*!40000 ALTER TABLE `subcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `Supplier_Id` int(11) NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(45) NOT NULL,
  `URL` varchar(45) NOT NULL,
  `Address_Address_id` int(11) NOT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `email-id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Supplier_Id`,`Address_Address_id`),
  KEY `fk_Supplier_Address1_idx` (`Address_Address_id`),
  CONSTRAINT `fk_Supplier_Address1` FOREIGN KEY (`Address_Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Hindal Co','www,hindalco.com',21000,'8795462356','hindalcoltd@gmal.com'),(2,'Apco Inc','www.apco.com',20011,'987098562','apcoltc@gmail.com'),(3,'WoodMart','www.woodmart.com',20014,'987695438','woodmart@gmail.com');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_contact`
--

DROP TABLE IF EXISTS `supplier_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_contact` (
  `ContactId` int(11) NOT NULL AUTO_INCREMENT,
  `Contact_fName` varchar(45) NOT NULL,
  `Contact_lName` varchar(45) NOT NULL,
  `Age` varchar(45) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `Supplier_id` int(11) NOT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `email-id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ContactId`,`Supplier_id`),
  UNIQUE KEY `ContactId_UNIQUE` (`ContactId`),
  KEY `Supplier_id_idx` (`Supplier_id`),
  CONSTRAINT `Supplier_id` FOREIGN KEY (`Supplier_id`) REFERENCES `supplier` (`Supplier_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_contact`
--

LOCK TABLES `supplier_contact` WRITE;
/*!40000 ALTER TABLE `supplier_contact` DISABLE KEYS */;
INSERT INTO `supplier_contact` VALUES (50,'Rock','Ghag','34','Male',1,'98760986572','rock.ghag@gmail.com'),(51,'Shawn','Ghatawdekar','41','Male',1,'8906567654','s.ghatawdekar@gmail.com'),(52,'Aditya','Pawar','22','Male',2,'9806578791','a.pawar@gmail.com'),(53,'Pranav','Waimbe','23','Male',3,'9807686725','p.walimbe@gmail.com');
/*!40000 ALTER TABLE `supplier_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_contact_has_address`
--

DROP TABLE IF EXISTS `supplier_contact_has_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_contact_has_address` (
  `Supplier_Contact_ContactId` int(11) NOT NULL,
  `Address_Address_id` int(11) NOT NULL,
  PRIMARY KEY (`Supplier_Contact_ContactId`,`Address_Address_id`),
  KEY `fk_Supplier_Contact_has_Address_Address1_idx` (`Address_Address_id`),
  KEY `fk_Supplier_Contact_has_Address_Supplier_Contact1_idx` (`Supplier_Contact_ContactId`),
  CONSTRAINT `fk_Supplier_Contact_has_Address_Address1` FOREIGN KEY (`Address_Address_id`) REFERENCES `address` (`Address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Supplier_Contact_has_Address_Supplier_Contact1` FOREIGN KEY (`Supplier_Contact_ContactId`) REFERENCES `supplier_contact` (`ContactId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_contact_has_address`
--

LOCK TABLES `supplier_contact_has_address` WRITE;
/*!40000 ALTER TABLE `supplier_contact_has_address` DISABLE KEYS */;
INSERT INTO `supplier_contact_has_address` VALUES (50,20005),(51,20005),(52,20015),(53,20016);
/*!40000 ALTER TABLE `supplier_contact_has_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `supplier_details`
--

DROP TABLE IF EXISTS `supplier_details`;
/*!50001 DROP VIEW IF EXISTS `supplier_details`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `supplier_details` AS SELECT 
 1 AS `CompanyName`,
 1 AS `concat_ws('  ',contact_fname,contact_lname)`,
 1 AS `Supply_date`,
 1 AS `Product_Name`,
 1 AS `Product_Description`,
 1 AS `Manufacturer_Name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `supply`
--

DROP TABLE IF EXISTS `supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supply` (
  `Product_Product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `Supply_Date` date NOT NULL,
  `Supplier_Contact_id` int(11) NOT NULL,
  KEY `fk_Supplier_has_Product_Product1_idx` (`Product_Product_id`),
  KEY `supplier_Contact_id_idx` (`Supplier_Contact_id`),
  CONSTRAINT `fk_Supplier_has_Product_Product1` FOREIGN KEY (`Product_Product_id`) REFERENCES `product` (`Product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supplier_Contact_id` FOREIGN KEY (`Supplier_Contact_id`) REFERENCES `supplier_contact` (`ContactId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supply`
--

LOCK TABLES `supply` WRITE;
/*!40000 ALTER TABLE `supply` DISABLE KEYS */;
INSERT INTO `supply` VALUES (1000,10,'2017-03-21',50),(1002,8,'2016-03-10',50),(1003,12,'2017-09-11',53),(1004,32,'2017-10-19',53),(1005,6,'2017-10-12',51),(1006,18,'2017-08-14',51),(1007,10,'2017-08-10',52);
/*!40000 ALTER TABLE `supply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'e-commerce_database'
--

--
-- Dumping routines for database 'e-commerce_database'
--
/*!50003 DROP PROCEDURE IF EXISTS `total_sales_per_day` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `total_sales_per_day`(in date_order date)
Begin
select Orderdate,sum((Price-(Price*Discount_Available )/100)*quantity)as Total from Order_table 
inner join product_details on product_details.idProduct_Details= Order_table.ProductDetails_id 
inner join product on product_details.product_product_id= product.product_id
inner join manufacturer on Product.manufacturer_id=Manufacturer.manufacturer_id
where order_table.orderdate = date_order
group by orderdate with rollup; 
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `update_product_details` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_product_details`(In id int)
Begin
update product_details
set availablity = 'Sold'
where product_details.idProduct_Details =id;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `bill_detals`
--

/*!50001 DROP VIEW IF EXISTS `bill_detals`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `bill_detals` AS select `order_table`.`Order_Id` AS `Order_id`,`manufacturer`.`Manufacturer_Name` AS `Manufacturer_Name`,`product`.`Product_Name` AS `Product_Name`,`product`.`Product_description` AS `Product_description`,`order_table`.`quantity` AS `Quantity`,`product`.`Price` AS `Price`,`product_details`.`Discount_Available` AS `Discount_Available`,((`product`.`Price` - ((`product`.`Price` * `product_details`.`Discount_Available`) / 100)) * `order_table`.`quantity`) AS `Total` from (((`order_table` join `product_details` on((`product_details`.`idProduct_Details` = `order_table`.`ProductDetails_id`))) join `product` on((`product_details`.`Product_Product_id` = `product`.`Product_id`))) join `manufacturer` on((`product`.`Manufacturer_id` = `manufacturer`.`Manufacturer_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `customer_details`
--

/*!50001 DROP VIEW IF EXISTS `customer_details`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `customer_details` AS select `order_table`.`Order_Id` AS `order_id`,`order_table`.`OrderDate` AS `Orderdate`,`order_table`.`cardtype_Card_Number` AS `cardtype_card_number`,`customer`.`First_Name` AS `First_name`,`customer`.`Last_Name` AS `Last_Name`,`address`.`Line_1` AS `Line_1`,`address`.`Line_2` AS `Line_2`,`address`.`City` AS `City`,`address`.`State` AS `State`,`address`.`ZIP` AS `Zip`,`address`.`Country` AS `Country` from (((((`order_table` join `cardtype` on((`order_table`.`cardtype_Card_Number` = `cardtype`.`Card_Number`))) join `payment_option` on((`cardtype`.`Payment_Option_payment_id` = `payment_option`.`payment_id`))) join `customer` on((`payment_option`.`Customer_Id` = `customer`.`Customer_id`))) join `customer_has_address` on((`customer_has_address`.`Customer_Customer_id` = `customer`.`Customer_id`))) join `address` on((`customer_has_address`.`Address_Address_id` = `address`.`Address_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `customer_order`
--

/*!50001 DROP VIEW IF EXISTS `customer_order`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `customer_order` AS select concat_ws('  ',`customer`.`First_Name`,`customer`.`Last_Name`) AS `Customer_Name`,`customer`.`emailid` AS `emailid`,`cardtype`.`Card_Number` AS `Card_Number`,`cardtype`.`Bank_Name` AS `Bank_Name`,`order_table`.`Order_Id` AS `Order_Id`,`product_details`.`Colour` AS `Colour`,`product`.`Product_Name` AS `Product_Name`,`product`.`Product_description` AS `Product_description`,`manufacturer`.`Manufacturer_Name` AS `Manufacturer_Name` from ((((((`manufacturer` join `product` on((`product`.`Manufacturer_id` = `manufacturer`.`Manufacturer_id`))) join `product_details` on((`product_details`.`Product_Product_id` = `product`.`Product_id`))) join `order_table` on((`order_table`.`ProductDetails_id` = `product_details`.`idProduct_Details`))) join `cardtype` on((`cardtype`.`Card_Number` = `order_table`.`cardtype_Card_Number`))) join `payment_option` on((`payment_option`.`payment_id` = `cardtype`.`Payment_Option_payment_id`))) join `customer` on((`customer`.`Customer_id` = `payment_option`.`Customer_Id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `supplier_details`
--

/*!50001 DROP VIEW IF EXISTS `supplier_details`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `supplier_details` AS select `supplier`.`CompanyName` AS `CompanyName`,concat_ws('  ',`supplier_contact`.`Contact_fName`,`supplier_contact`.`Contact_lName`) AS `concat_ws('  ',contact_fname,contact_lname)`,`supply`.`Supply_Date` AS `Supply_date`,`product`.`Product_Name` AS `Product_Name`,`product`.`Product_description` AS `Product_Description`,`manufacturer`.`Manufacturer_Name` AS `Manufacturer_Name` from ((((`manufacturer` join `product` on((`product`.`Manufacturer_id` = `manufacturer`.`Manufacturer_id`))) join `supply` on((`product`.`Product_id` = `supply`.`Product_Product_id`))) join `supplier_contact` on((`supply`.`Supplier_Contact_id` = `supplier_contact`.`ContactId`))) join `supplier` on((`supplier`.`Supplier_Id` = `supplier_contact`.`Supplier_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-13 21:40:32
