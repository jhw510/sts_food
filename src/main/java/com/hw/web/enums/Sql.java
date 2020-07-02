package com.hw.web.enums;

import com.hw.web.domains.UserDTO;

public enum Sql {
	CREATE_DB, 
	CREATE_USERS, DROP_USERS, TRUNCATE_USERS,
	CREATE_ARTICLES, DROP_ARTICLES, TRUNCATE_ARTICLES,
	CREATE_IMAGES, DROP_IMAGES, TRUNCATE_IMAGES;
	@Override
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB:
			result = "create database mariadb";
			break;
		case CREATE_USERS:
			result = "create table users(userid varchar(30)primary key,"+ 
                    " password varchar(30) ," +
                    " name varchar(30) ," +
                    " birthday varchar(30) ," +
                    " gender varchar(10) ," +
                    " telephone varchar(30))ENGINE=InnoDB DEFAULT CHARSET=UTF8" ;
			break;
		case DROP_USERS:
			result = "drop table users";
			break;
		
		case TRUNCATE_USERS:
			result = "truncate table users";
			break;
		case TRUNCATE_ARTICLES :
			result = "truncate table articles";
			break;
		case CREATE_ARTICLES:
	           result =  "create table articles("
	                   + "artseq int auto_increment primary key,"
	                   + "imageSeq int  references images,"
	                   + "userid varchar(30)  references persons,"
	                   + "comments varchar(500),"
	                   + "message varchar(50),"
	                   + "rating varchar(50), "
	                   + "boardtype varchar(50),"
	                   + "title varchar(300),"
	                   + "content varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=UTF8";
				break;
		case DROP_ARTICLES:
			result = "drop table articles";
			break;
		case CREATE_IMAGES:
	           result =  "create table images("+
	                   "imageSeq int auto_increment primary key"+
	                   "image varchar(100)"+
	                    ")ENGINE=InnoDB DEFAULT CHARSET=UTF8";
				break;
		case TRUNCATE_IMAGES :
			result = "truncate table images";
			break;
		case DROP_IMAGES:
			result = "drop table images";
			break;
		default:
			break;
		}
		return result;
	}
	
}