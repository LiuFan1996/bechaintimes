--SQL存放区-------------
create database bechain ; 

DROP TABLE IF EXISTS bechain_user;
CREATE TABLE bechain_user (
  id int(12) NOT NULL auto_increment,
  email varchar(50) NOT NULL,
  nickname varchar(50) default NULL,
  password varchar(50) NOT NULL,
  user_integral int(12) NOT NULL default '0',  
  is_email_verify char(3),
  email_verify_code varchar(50) default NULL,
  last_login_time bigint default NULL,
  last_login_ip varchar(15) default NULL,
  PRIMARY KEY  (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from bechain_user ;


drop table article;

create table article(
	id int(15) PRIMARY KEY auto_increment,
	classify  varchar(10)  default '区块链资讯',
	title  varchar(50) NOT NULL,
	writer varchar(20)  default 'admin',
	ico    varchar(50) NOT NULL,
	body   text,
	date   datetime
)auto_increment=100000;

select * from article ;









