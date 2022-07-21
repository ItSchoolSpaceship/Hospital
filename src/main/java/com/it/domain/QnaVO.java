package com.it.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class QnaVO {
	
	private int id;
	
	private int readcnt;
	
	private int no;
	
	private int root;
	
	private int step;
	
	private int indent;
	
	private String title;
	
	private String content;
	
	private String writer;
	
	private String filename;
	
	private String filepath;
	
	private String name;
	
	private Date writedate;
	

}