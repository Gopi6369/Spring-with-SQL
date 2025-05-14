package com.example.Spring_MYSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMysqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringMysqlApplication.class, args);
	}

}


/*
Hibernate:
create table mysqlbean (
		id integer not null auto_increment,
		address varchar(255),
age integer not null,
name varchar(255),
primary key (id)
    ) engine=InnoDB
*/

/*

Hibernate:
create table new_mysql (
		id integer not null auto_increment,
		address varchar(255),
age integer not null,
name varchar(255),
primary key (id)
    ) engine=InnoDB
*/
