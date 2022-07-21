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
	
	public boolean member_insert(MemberVO vo) {
		return mapper.join(vo) == false ? false : true;
	}

	public MemberVO member_select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public MemberVO member_login(HashMap<String, String> map) {
		//return sql.selectOne("member.mapper.login", map);
		return mapper.login(map);
	}

	public boolean member_id_check(String id) {
		//return  sql.selectOne("member.mapper.id_check", id) == 0 ? true : false;
		return mapper.id_check(id) == false ? true : false;
	}

	public boolean member_update(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean member_delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}