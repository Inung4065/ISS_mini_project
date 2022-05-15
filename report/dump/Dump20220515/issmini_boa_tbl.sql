-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: issmini
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `boa_tbl`
--

DROP TABLE IF EXISTS `boa_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `boa_tbl` (
  `no` int NOT NULL,
  `title` varchar(30) NOT NULL,
  `contents` varchar(1000) NOT NULL,
  `user` varchar(20) NOT NULL,
  `createTime` varchar(17) NOT NULL,
  `delete` tinyint NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boa_tbl`
--

LOCK TABLES `boa_tbl` WRITE;
/*!40000 ALTER TABLE `boa_tbl` DISABLE KEYS */;
INSERT INTO `boa_tbl` VALUES (1,'test1','test1','test1','22/04/04 18:00:00',1),(2,'test2','test2','test2','22/04/04 18:30:00',1),(3,'test3','test3','test3','22/04/04 18:30:00',1),(4,'test4','test4','test4','22/04/04 18:30:00',1),(5,'test5','test5','test5','22/04/04 18:30:00',1),(6,'test6','test6','test6','22/04/04 18:30:00',1),(7,'test7','test7','test7','22/04/04 18:30:00',1),(8,'test8','test8','test8','22/04/04 18:30:00',1),(9,'test9','test9','test9','22/04/04 18:30:00',1),(10,'test10','test10','test10','22/04/04 18:30:00',1),(11,'test11','test11','test11','22/04/04 18:30:00',1);
/*!40000 ALTER TABLE `boa_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-15 20:58:49
