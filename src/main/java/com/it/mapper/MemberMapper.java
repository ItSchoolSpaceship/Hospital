package com.it.mapper;

import java.util.HashMap;

import com.it.domain.MemberVO;

public interface MemberMapper {
	
	public MemberVO login(HashMap<String, String> map);
	
	int id_check(String id);
	
	int join(MemberVO vo);
	
}
