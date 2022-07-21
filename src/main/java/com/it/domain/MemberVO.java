package com.it.domain;

import lombok.Data;

@Data
public class MemberVO {
	
	private String name;
	
	private String id;
	
	private String pw;
	
	private String addr;
	
	private String tel;
	
	private String gender;
	
	private String birth;
	
	private String post;
	
	private String email;
	
	private String admin;	
	
	private int age;
	
	public void setAddr(String addr) {
		this.addr = addr.replace(",", "<br>");
	}
	
	public void setTel(String tel) {
		this.tel = tel.replaceAll(",", "-");
	}
	
}