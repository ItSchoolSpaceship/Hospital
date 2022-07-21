package com.it.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String name, id, pw, addr, tel, gender, birth, post, email, admin;	
	private int age;
	
	
	
	
	
	public void setAddr(String addr) {
		this.addr = addr.replace(",", "<br>");
	}
	
	public void setTel(String tel) {
		this.tel = tel.replaceAll(",", "-");
	}
	
	
	
	
	
}