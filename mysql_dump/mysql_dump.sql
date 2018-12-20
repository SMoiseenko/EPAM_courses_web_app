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
  `price` decimal(10,2) NOT NULL DEFAULT '0.00',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `periodicals_fk0` (`periodical_type`),
  CONSTRAINT `periodicals_fk0` FOREIGN KEY (`periodical_type`) REFERENCES `periodicals_types` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodicals`
--

LOCK TABLES `periodicals` WRITE;
/*!40000 ALTER TABLE `periodicals` DISABLE KEYS */;
INSERT INTO `periodicals` VALUES (1,'0190-8286','NEWSPAPPER','The Washington Post','The Washington Post (sometimes abbreviated as WaPo) is a major American daily newspaper published in Washington, D.C., with a particular emphasis on national politics and the federal government. It has the largest circulation in the Washington metropolitan area. Its slogan \"Democracy Dies in Darkness\" began appearing on its masthead in 2017. Daily broadsheet editions are printed for the District of Columbia, Maryland, and Virginia.',365,0.35,1),(2,'0362-4331','NEWSPAPPER','The New York Times','The New York Times (shortened as The Times and abbreviated as The NYT) is an American newspaper based in New York City with worldwide influence and readership.Founded in 1851, the paper has won 125 Pulitzer Prizes, more than any other newspaper. The Times is ranked 17th in the world by circulation and 2nd in the U.S. ',365,0.50,1),(3,'1992-3058','UNDEFINED','СБ. Беларусь сегодня','Белорусская общественно-политическая газета. Издаётся с августа 1927 года. Выходит 5 раз в неделю. Учредители — Администрация президента Республики Беларусь и редакционный совет. На декабрь 2013 года тираж — 400 614 экземпляров. Крупнейшее печатное СМИ страны. В последние годы выходит под брендом ≪СБ. Беларусь сегодня≫. ',270,0.37,1),(4,'5894-4521','UNDEFINED','Marvel Adventures','Marvel Adventures, formerly Marvel Age, was an imprint of Marvel Comics intended for younger audiences, including small children. Unlike the standard comics published by Marvel, which often take place in story arcs spanning several issues, each Marvel Adventures comic tells a standalone story. In April 2012 it was replaced by all new All Ages line tied to the Marvel Universe block on Disney XD.',12,17.00,1),(5,'3256-4521','UNDEFINED','Batman','Batman is an ongoing American comic book series featuring the DC Comics superhero Batman as its main protagonist. The character first appeared in Detective Comics #27 (cover dated May 1939). Batman proved to be so popular that a self-titled ongoing comic book series began publication with a cover date of Spring 1940. It was first advertised in early April 1940, one month after the first appearance of his new sidekick, Robin, the Boy Wonder. ',54,20.50,1),(6,'3697-5428','UNDEFINED','Наша нива','Начала выходить в Вильне с 10 (23) ноября 1906 по 7 августа 1915 на белорусском языке кириллицей и с первого номера до № 42, 18 (31) октября 1912) также белорусской латиницей, с заглавиями «Наша Ніва» и «Nasza Niwa».  Редакторы-издатели З. Вольский, А. Власов, И. Луцкевич. Печаталась в типографии Мартина Кухты. ',12,0.79,1),(7,'3587-8542','UNDEFINED','Marvel','Spider-Man',54,2.50,0),(8,'1234-4321','UNDEFINED','Enter title','Enter description',0,0.00,0),(9,'1234-4321','NEWSPAPPER','Перспектива','Перспективы нЭт',500,15.00,0),(10,'1234-4321','NEWSPAPPER','Советская белорусия','Как хорошо живется у нас в стране',365,100.00,0),(11,'1145-8545','UNDEFINED','ТЕперь мы periodicals','Enter descriptionon',15,20.00,0),(12,'1234-4321','UNDEFINED','djdghk','Enter descriptiodghkfghjdfn',0,0.00,0),(13,'5569-','UNDEFINED','Enter title','Enter description',0,0.00,0);
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
-- Table structure for table `subscribes`
--

DROP TABLE IF EXISTS `subscribes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subscribes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `periodical_id` int(11) NOT NULL,
  `total_price` decimal(10,2) NOT NULL DEFAULT '0.00',
  `paid` decimal(10,2) NOT NULL DEFAULT '0.00',
  `months_of_subscription` int(11) NOT NULL DEFAULT '0',
  `date_begin_subscribe` date NOT NULL,
  `date_end_subscribe` date NOT NULL,
  `payment_status` tinyint(1) NOT NULL DEFAULT '0',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `subscribes_fk0` (`user_id`),
  KEY `subscribes_fk1` (`periodical_id`),
  CONSTRAINT `subscribes_fk0` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `subscribes_fk1` FOREIGN KEY (`periodical_id`) REFERENCES `periodicals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscribes`
--

LOCK TABLES `subscribes` WRITE;
/*!40000 ALTER TABLE `subscribes` DISABLE KEYS */;
INSERT INTO `subscribes` VALUES (11,2,4,17.00,0.00,1,'2018-12-20','2019-01-20',0,1),(12,2,5,1107.00,0.00,12,'2018-12-20','2019-12-20',0,1);
/*!40000 ALTER TABLE `subscribes` ENABLE KEYS */;
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
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`),
  KEY `users_fk0` (`role_type`),
  CONSTRAINT `users_fk0` FOREIGN KEY (`role_type`) REFERENCES `users_roles` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','ADMIN','Admin','Adminovich','admin@admin.com','+375295556666','230025, Grodno, Kirova str., 1 ',100.00,1),(2,'nikola','tesla','CUSTOMER','Nikola','Tesla','nikolatesla@tut.by','+12123633200','10004, New York city',1000.00,1),(6,'testuser','12345678','CUSTOMER','Вася','Пупкин','vasilij.pupkin@gmail.com','+375296666666','230026 Grodno, Kleckova 26',0.00,1);
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

-- Dump completed on 2018-12-20 16:23:42
