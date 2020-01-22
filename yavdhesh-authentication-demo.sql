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
