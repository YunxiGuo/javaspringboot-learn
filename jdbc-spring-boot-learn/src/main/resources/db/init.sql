DROP TABLE IF EXISTS `Account`;
Create TABLE `Account`(
                          id integer AUTO_INCREMENT,
                          name VARCHAR(50) not null ,
                          age integer ,
                          primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert Account(id,name,age) values (1,'admin',18);