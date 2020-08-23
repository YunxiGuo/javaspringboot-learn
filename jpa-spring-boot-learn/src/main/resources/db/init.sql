drop table if exists author;
create table author(
    id integer unique ,
    name varchar(100) not null default 'name',
    hometown varchar(200) not null default 'hometown',
    create_at timestamp not null ,
    update_at timestamp ,
    primary key (id)
);
drop table if exists book;
create table book(
    id integer unique ,
    type varchar(100) not null default 'type',
    title varchar(200) not null default 'title',
    create_at timestamp not null ,
    update_at timestamp ,
    description varchar(500),
    author_id integer,
    primary key (id)
);
insert into book(id,type,title,create_at,update_at,description) values (1,'type1','title1','2020-08-23:11:11:00','2020-08-23:11:18:00','description_1');
insert into book(id,type,title,create_at,update_at,description) values (2,'type2','title2','2020-08-23:11:12:00','2020-08-23:11:18:00','description_2');
insert into book(id,type,title,create_at,update_at,description) values (3,'type3','title3','2020-08-23:11:13:00','2020-08-23:11:18:00','description_3');
insert into book(id,type,title,create_at,update_at,description) values (4,'type4','title4','2020-08-23:11:14:00','2020-08-23:11:18:00','description_4');
insert into book(id,type,title,create_at,update_at,description) values (5,'type5','title5','2020-08-23:11:15:00','2020-08-23:11:18:00','description_5');