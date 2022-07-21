package com.it.mapper;

import java.util.HashMap;

import com.it.domain.MemberVO;

public interface MemberMapper {
	
	public MemberVO login(HashMap<String, String> map);
	
	boolean id_check(String id);
	
	boolean join(MemberVO vo);
	

}
