package com.it.domain;

import lombok.Data;

@Data
public class BoardCommentVO {
	
	private int id;
	
	private int pid;
	
	private String writer;
	
	private String name;
	
	private String content;
	
	private String writedate;
	
}