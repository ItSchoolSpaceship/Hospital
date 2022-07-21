package com.it.mapper;

import java.util.List;

import com.it.domain.QnaVO;

public interface QnaMapper {
	
	void insert(QnaVO vo);
	
	QnaVO detail(int id);
	
	void read(int id);
	
	void delete(int id);
	
	void update(QnaVO vo);
	
	List<QnaVO> list();
	
	List<QnaVO> list(QnaPage page);
	
	int totalList(QnaPage page);
	
	void reply_insert(QnaVO vo);

}

