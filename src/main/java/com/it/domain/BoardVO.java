package com.it.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int id;
	
	private int readcnt;
	
	private int no;
	
	private String title;
	
	private String content;
	
	private String writer; 
	
	private String name; 
	
	private String filename;
	
	private String filepath;
	
	private Date writedate;
	
}