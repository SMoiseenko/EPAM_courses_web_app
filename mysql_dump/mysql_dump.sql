CREATE DATABASE  IF NOT EXISTS `mywebprojectDB` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mywebprojectDB`;
-- MySQL dump 10.13  Distrib 8.0.13, for Linux (x86_64)
--
-- Host: localhost    Database: mywebprojectDB
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `periodicals`
--

DROP TABLE IF EXISTS `periodicals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `periodicals` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ISSN` varchar(9) NOT NULL,
  `periodical_type` varchar(40) NOT NULL DEFAULT 'UNDEFINED',
  `title` varchar(100) NOT NULL,
  `description` text,
  `qty_per_year` int(11) NOT NULL,
  `price` decimal(5,2) NOT NULL DEFAULT '0.00',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `periodicals_fk0` (`periodical_type`),
  CONSTRAINT `periodicals_fk0` FOREIGN KEY (`periodical_type`) REFERENCES `periodicals_types` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodicals`
--

LOCK TABLES `periodicals` WRITE;
/*!40000 ALTER TABLE `periodicals` DISABLE KEYS */;
INSERT INTO `periodicals` VALUES (1,'0190-8286','NEWSPAPPER','The Washington Post','The Washington Post (sometimes abbreviated as WaPo) is a major American daily newspaper published in Washington, D.C., with a particular emphasis on national politics and the federal government. It has the largest circulation in the Washington metropolitan area. Its slogan \"Democracy Dies in Darkness\" began appearing on its masthead in 2017. Daily broadsheet editions are printed for the District of Columbia, Maryland, and Virginia.',365,0.35,1),(2,'0362-4331','NEWSPAPPER','The New York Times','The New York Times (shortened as The Times and abbreviated as The NYT) is an American newspaper based in New York City with worldwide influence and readership.Founded in 1851, the paper has won 125 Pulitzer Prizes, more than any other newspaper. The Times is ranked 17th in the world by circulation and 2nd in the U.S. ',365,0.50,1),(3,'1','UNDEFINED','55698545','1',1,1.00,1),(4,'1234-123','UNDEFINED','TEST','TEst Discription',666,123.00,1),(5,'1234-5623','UNDEFINED','TEST','TEst Discription',666,123.00,1),(6,'1234-5678','UNDEFINED','TEST','TEst Discription',666,1.20,1),(7,'mobile','UNDEFINED','testew','will it wirk',625,0.27,1),(8,'1234-4321','UNDEFINED','Enter title','Enter description',0,0.00,1),(9,'1234-4321','NEWSPAPPER','Перспектива','Перспективы нЭт',500,15.00,1),(10,'1234-4321','NEWSPAPPER','Советская белорусия','Как хорошо живется у нас в стране',365,100.00,1),(11,'1145-8545','UNDEFINED','ТЕперь мы periodicals','Enter descriptionon',15,20.00,1),(12,'1234-4321','UNDEFINED','djdghk','Enter descriptiodghkfghjdfn',0,0.00,1);
/*!40000 ALTER TABLE `periodicals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodicals_types`
--

DROP TABLE IF EXISTS `periodicals_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `periodicals_types` (
  `type` varchar(40) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodicals_types`
--

LOCK TABLES `periodicals_types` WRITE;
/*!40000 ALTER TABLE `periodicals_types` DISABLE KEYS */;
INSERT INTO `periodicals_types` VALUES ('COMIC',1),('NEWSPAPPER',1),('SCIENCE_MAGAZINE',1),('UNDEFINED',1);
/*!40000 ALTER TABLE `periodicals_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `role_type` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'CUSTOMER',
  `first_name` varchar(40) NOT NULL,
  `last_name` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `balance` decimal(10,2) DEFAULT '0.00',
  `active` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`),
  KEY `users_fk0` (`role_type`),
  CONSTRAINT `users_fk0` FOREIGN KEY (`role_type`) REFERENCES `users_roles` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','ADMIN','Admin','Adminovich','admin@admin.com','+375295556666','230025, Grodno, Kirova str., 1 ',100.00,1),(2,'testuser','test','ANONYMOUS','testname','testsurname','test@tut.by','+375665892','236547, Grodno cite',0.00,0),(3,'god','god','ANONYMOUS','super','user','super@user.com','+547862218','665478, Heaven',0.00,0),(4,'vasyapupkin','vasvas','ANONYMOUS','vasya','pupkin','vasua@pupkin.ko','+655546845','555666, Hell',0.00,0),(5,'customer','1234','CUSTOMER','Best','Customer','customer@thebest.com','+3752912345678','23000, Grodno, Kleckova 1',0.00,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users_roles` (
  `type` varchar(40) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES ('ADMIN',1),('ANONYMOUS',0),('CUSTOMER',1);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mywebprojectDB'
--

--
-- Dumping routines for database 'mywebprojectDB'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-17  1:44:40
