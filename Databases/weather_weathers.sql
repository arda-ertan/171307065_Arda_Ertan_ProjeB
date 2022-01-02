-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: weather
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `weathers`
--

DROP TABLE IF EXISTS `weathers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weathers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `temp` double NOT NULL,
  `max_temp` double NOT NULL,
  `min_temp` double NOT NULL,
  `state` varchar(45) NOT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weathers`
--

LOCK TABLES `weathers` WRITE;
/*!40000 ALTER TABLE `weathers` DISABLE KEYS */;
INSERT INTO `weathers` VALUES (1,'Istanbul','TR',15.8,16.15,10.59,'clear sky','2021-12-10 00:00:00'),(2,'Istanbul','TR',15.78,16.09,12.81,'clear sky','2021-12-10 00:00:00'),(3,'Istanbul','TR',15.78,16.09,12.81,'clear sky','2021-12-10 00:00:00'),(4,'Istanbul','TR',16.81,17.26,13.37,'clear sky','2021-12-10 00:00:00'),(5,'Istanbul','TR',16.81,17.26,13.37,'clear sky','2021-12-10 00:00:00'),(6,'Istanbul','TR',17.78,18.37,17.68,'clear sky','2021-12-10 00:00:00'),(7,'Istanbul','TR',18.03,19.09,17.68,'clear sky','2021-12-10 10:37:27'),(8,'Istanbul','TR',18.03,19.09,17.68,'clear sky','2021-12-10 10:38:57'),(9,'Istanbul','TR',18.03,19.09,17.68,'clear sky','2021-12-10 10:54:44'),(10,'Istanbul','TR',18.03,19.09,17.68,'clear sky','2021-12-10 10:56:37'),(11,'Ankara','TR',11.78,11.78,9.51,'scattered clouds','2021-12-10 10:58:09'),(12,'Ankara','TR',11.7,12.34,10.66,'clear sky','2021-12-10 11:24:37'),(13,'Ankara','TR',11.7,12.34,10.66,'clear sky','2021-12-10 11:30:26'),(14,'Ankara','TR',11.98,12.89,10.66,'clear sky','2021-12-10 11:33:43'),(15,'Manisa Province','TR',14.71,14.71,14.71,'few clouds','2021-12-10 11:54:36'),(16,'Ordu','TR',7.28,7.28,7.28,'clear sky','2021-12-10 13:23:12'),(17,'Ordu','TR',7.28,7.28,7.28,'clear sky','2021-12-10 16:30:12'),(18,'Kars','TR',-0.75,0.47,-0.75,'clear sky','2021-12-10 16:31:26'),(19,'New York','US',5.33,7.75,1.2,'overcast clouds','2021-12-10 16:31:40'),(20,'Bursa','TR',17.02,17.02,17.02,'overcast clouds','2021-12-10 16:42:19'),(21,'Istanbul','TR',17.31,19.09,16.68,'broken clouds','2021-12-10 16:43:43'),(22,'Istanbul','TR',17.31,19.09,16.68,'broken clouds','2021-12-10 16:45:29'),(23,'Istanbul','TR',5.33,7.26,4.68,'light rain','2021-12-16 13:28:51'),(24,'Istanbul','TR',5.11,7.05,4.68,'light rain','2021-12-16 13:57:12'),(25,'Istanbul','TR',5.09,7.05,4.68,'light rain','2021-12-16 14:43:44'),(26,'Ankara','TR',3.54,3.75,3.45,'broken clouds','2021-12-16 14:45:27'),(27,'Istanbul','TR',5.6,8.16,5.09,'light rain','2021-12-16 15:31:47'),(28,'Istanbul','TR',5.95,8.16,5.68,'broken clouds','2021-12-16 16:18:14'),(29,'Afyonkarahisar','TR',-0.41,-0.41,-0.41,'overcast clouds','2021-12-17 09:54:52'),(30,'Karaman Province','TR',1.84,1.84,1.84,'overcast clouds','2021-12-20 16:53:43'),(31,'Istanbul','TR',4.93,6.7,3.37,'light rain','2021-12-21 17:15:09');
/*!40000 ALTER TABLE `weathers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-22 10:44:40
