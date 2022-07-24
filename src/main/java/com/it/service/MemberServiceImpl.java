package com.it.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.it.domain.MemberVO;
import com.it.mapper.MemberMapper;

@Service
public class MemberServiceImpl {
	
	private MemberMapper mapper;
	
	@Autowired
	public MemberServiceImpl(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	public boolean memberInsert(MemberVO vo) {
		return mapper.join(vo) == 0 ? false : true;
	}

	public MemberVO memberSelect(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public MemberVO memberLogin(HashMap<String, String> map) {
		//return sql.selectOne("member.mapper.login", map);
		return mapper.login(map);
	}

	public boolean memberIdCheck(String id) {
		//return  sql.selectOne("member.mapper.id_check", id) == 0 ? true : false;
		return mapper.id_check(id) == 0 ? true : false;
	}

	public boolean memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean memberDelete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}