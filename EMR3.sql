
create database EMR3;
use EMR3;
CREATE TABLE patient (
  id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  dob date not null,
  cellphone_no varchar(20) default null,
  email VARCHAR(100) DEFAULT NULL,
  gender char(10) not null,
  race varchar(20) default null,
  ethnicity varchar(20) default null,
  primary_language varchar(20) default null,
  preferred_language varchar(20) default null,
  primary_insurance varchar(50) default null,
  ssn varchar(15) default null,
  create_date DATETIME NOT NULL,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY  (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
show tables;

select * from patient;
drop table patient  ;

INSERT INTO patient VALUES

(1,'Liam','Smith','1986-01-31','201-381-9478','Liam.Smith@gmail.com','M','White','yellowtyytytutu','English','English','Cigna','111-22-3333','2020-01-01 00:00:00','2020-01-01 05:00:00'),
(2,'Noah','Johnson','1986-02-01','201-381-9479','Noah.Johnson@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3334','2020-01-02 00:00:00','2020-01-02 05:00:00'),
(3,'William','Williams','1986-02-02','201-381-9480','William.Williams@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3335','2020-01-03 00:00:00','2020-01-03 05:00:00'),
(4,'James','Jones','1986-02-03','201-381-9481','James.Jones@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3336','2020-01-04 00:00:00','2020-01-04 05:00:00'),
 (5,'Oliver','Brown','1986-02-04','201-381-9482','Oliver.Brown@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3337','2020-01-05 00:00:00','2020-01-05 05:00:00'),
 (6,'Benjamin','Davis','1986-02-05','201-381-9483','Benjamin.Davis@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3338','2020-01-06 00:00:00','2020-01-06 05:00:00'),
(7,'Elijah','Miller','1986-02-06','201-381-9484','Elijah.Miller@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3339','2020-01-07 00:00:00','2020-01-07 05:00:00'),
 (8,'Lucas','Wilson','1986-02-07','201-381-9485','Lucas.Wilson@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3340','2020-01-08 00:00:00','2020-01-08 05:00:00'),
 (9,'Mason','Moore','1986-02-08','201-381-9486','Mason.Moore@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3341','2020-01-09 00:00:00','2020-01-09 05:00:00'),
 (10,'Logan','Taylor','1986-02-09','201-381-9487','Logan.Taylor@gmail.com','M','White','yellowtyytytutu','English','English','Cigna','111-22-3342','2020-01-10 00:00:00','2020-01-10 05:00:00'),
 (11,'Alexander','Anderson','1986-02-10','201-381-9488','Alexander.Anderson@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3343','2020-01-11 00:00:00','2020-01-11 05:00:00'),
 (12,'Ethan','Thomas','1986-02-11','201-381-9489','Ethan.Thomas@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3344','2020-01-12 00:00:00','2020-01-12 05:00:00'),
 (13,'Jacob','Jackson','1986-02-12','201-381-9490','Jacob.Jackson@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3345','2020-01-13 00:00:00','2020-01-13 05:00:00'),
 (14,'Michael','White','1986-02-13','201-381-9491','Michael.White@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3346','2020-01-14 00:00:00','2020-01-14 05:00:00'),
(15,'Daniel','Harris','1986-02-14','201-381-9492','Daniel.Harris@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3347','2020-01-15 00:00:00','2020-01-15 05:00:00'),
(16,'Henry','Martin','1986-02-15','201-381-9493','Henry.Martin@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3348','2020-01-16 00:00:00','2020-01-16 05:00:00'),
 (17,'Jackson','Thompson','1986-02-16','201-381-9494','Jackson.Thompson@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3349','2020-01-17 00:00:00','2020-01-17 05:00:00'),
(18,'Sebastian','Garcia','1986-02-17','201-381-9495','Sebastian.Garcia@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3350','2020-01-18 00:00:00','2020-01-18 05:00:00'),
(19,'Aiden','Martinez','1986-02-18','201-381-9496','Aiden.Martinez@gmail.com','M','White','Hispanic','English','English','Cigna','111-22-3351','2020-01-19 00:00:00','2020-01-19 05:00:00');

 