/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.5.25 : Database - bank
*********************************************************************
Server version : 5.5.25
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `bank`;

USE `bank`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `accountdetails` */

DROP TABLE IF EXISTS `accountdetails`;

CREATE TABLE `accountdetails` (
  `sender` varchar(20) DEFAULT NULL,
  `amount` decimal(10,0) DEFAULT NULL,
  `receiver` varchar(20) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `accountdetails` */

insert  into `accountdetails`(`sender`,`amount`,`receiver`,`date`) values ('ANDB54003800','1000','ANDB23288000','2020-08-03 18:19:09'),('ANDB23288000','1000','ANDB54003800','2020-08-03 18:37:14'),('ANDB23288000','1000','ANDB54003800','2020-08-03 18:44:32'),('ANDB23288000','1000','ANDB54003800','2020-08-03 18:44:57'),('ANDB23288000','1000','ANDB54003800','2020-08-03 18:45:16'),('ANDB23288000','1000','ANDB45678900','2020-08-03 18:46:11'),('ANDB23288000','1000','ANDB54003800','2020-08-03 18:46:48'),('ANDB54003800','1000','ANDB54003800','2020-08-03 19:12:50'),('ANDB54003800','1000','ANDB54003800','2020-08-03 21:22:53'),('ANDB54003800','1000','ANDB54003800','2020-08-03 21:24:18'),('ANDB54003800','1000','ANDB54003800','2020-08-03 21:25:23'),('ANDB54003800','1000','ANDB54003800','2020-08-03 21:26:30'),('ANDB54003800','1000','ANDB54003800','2020-08-03 21:30:18');

/*Table structure for table `userdetails` */

DROP TABLE IF EXISTS `userdetails`;

CREATE TABLE `userdetails` (
  `Name` varchar(30) DEFAULT NULL,
  `AccountNo` varchar(12) DEFAULT NULL,
  `Balance` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userdetails` */

insert  into `userdetails`(`Name`,`AccountNo`,`Balance`) values ('divya','ANDB54003800','42000'),('Bhavya','ANDB23288000','58100'),('mounika','ANDB45678900','40999');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
