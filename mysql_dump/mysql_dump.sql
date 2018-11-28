CREATE DATABASE  IF NOT EXISTS `periodicalsDB` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `periodicalsDB`;
-- MySQL dump 10.13  Distrib 8.0.13, for Linux (x86_64)
--
-- Host: localhost    Database: periodicalsDB
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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'root','root'),(2,'customer','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newspapers`
--

DROP TABLE IF EXISTS `newspapers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `newspapers` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
  `ISSN` varchar(9) NOT NULL,
  `title` varchar(100) NOT NULL,
  `description` text,
  `qty_per_year` int(11) NOT NULL,
  `price` decimal(5,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newspapers`
--

LOCK TABLES `newspapers` WRITE;
/*!40000 ALTER TABLE `newspapers` DISABLE KEYS */;
INSERT INTO `newspapers` VALUES ('1','0190-8286','The Washington Post','The Washington Post (sometimes abbreviated as WaPo) is a major American daily newspaper published in Washington, D.C., with a particular emphasis on national politics and the federal government. It has the largest circulation in the Washington metropolitan area. Its slogan \"Democracy Dies in Darkness\" began appearing on its masthead in 2017. Daily broadsheet editions are printed for the District of Columbia, Maryland, and Virginia.',365,0.35),('2','0362-4331','The New York Times','The New York Times (shortened as The Times and abbreviated as The NYT) is an American newspaper based in New York City with worldwide influence and readership.Founded in 1851, the paper has won 125 Pulitzer Prizes, more than any other newspaper. The Times is ranked 17th in the world by circulation and 2nd in the U.S. ',365,0.50),('3','1','1','1',1,1.00),('4','1234-123','TEST','TEst Discription',666,123.00),('5','1234-5623','TEST','TEst Discription',666,123.00),('6','1234-5678','TEST','TEst Discription',666,1.20),('7','mobile','testew','will it wirk',625,0.27);
/*!40000 ALTER TABLE `newspapers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-28  0:01:33
