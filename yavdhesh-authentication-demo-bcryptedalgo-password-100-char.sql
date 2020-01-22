

DROP DATABASE  IF EXISTS `spring_security_demo_plaintext`;

CREATE DATABASE  IF NOT EXISTS `spring_security_demo_plaintext`;
USE `spring_security_demo_plaintext`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ;

ALTER TABLE users MODIFY password VARCHAR(100);

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
);


insert into users  values ('yavdhesh','{noop}harsh',1);
insert into authorities values('yavdhesh','ROLE_EMPLOYEE');

insert into users  values ('harsh','{noop}harsh',1);
insert into authorities values('harsh','ROLE_EMPLOYEE');
insert into authorities values('harsh','ROLE_MANAGER');

insert into users  values ('shraddha','{noop}shraddha',1);
insert into authorities values('shraddha','ROLE_EMPLOYEE');
insert into authorities values('shraddha','ROLE_ADMIN');

bcrypted pass
vijay > $2a$10$p1tE588fycOZgo2n6nKx9eGuSm9zbcqeUe8V9jmwVy8axJ97.jVTO
sanjay > $2a$10$N3fx5.mj0f9n1HgRktRnN.ZHB4EGZ2hECOjGPJtnhEGxTUx7VviOa
Raamji > $2a$10$R6s2s4OUEYrJi5gFAfDLAuYBpShDd66OLiSn2nhvf9yCLm44mRigO

insert into users  values ('vijay','{bcrypt}$2a$10$p1tE588fycOZgo2n6nKx9eGuSm9zbcqeUe8V9jmwVy8axJ97.jVTO',1);
insert into authorities values('vijay','ROLE_EMPLOYEE');


insert into users  values ('sanjay','{bcrypt}$2a$10$N3fx5.mj0f9n1HgRktRnN.ZHB4EGZ2hECOjGPJtnhEGxTUx7VviOa',1);
insert into authorities values('sanjay','ROLE_EMPLOYEE');
insert into authorities values('sanjay','ROLE_ADMIN');

insert into users  values ('Raamji','{bcrypt}$2a$10$R6s2s4OUEYrJi5gFAfDLAuYBpShDd66OLiSn2nhvf9yCLm44mRigO',1);
insert into authorities values('Raamji','ROLE_EMPLOYEE');
insert into authorities values('Raamji','ROLE_MANAGER');

 UPDATE users
SET password='{bcrypt}$2a$10$R6s2s4OUEYrJi5gFAfDLAuYBpShDd66OLiSn2nhvf9yCLm44mRigO' where users.username='Raamji';
