package com.it.mapper;

import java.util.List;

import com.it.domain.QnaVO;

public interface QnaMapper {
	
	public void insert(QnaVO vo);
	
	public QnaVO detail(int id);
	
	public void read(int id);
	
	public void delete(int id);
	
	public void update(QnaVO vo);
	
	public List<QnaVO> list();
	
	public List<QnaVO> list(QnaPage page);
	
	public int totalList(QnaPage page);
	
	public void replyInsert(QnaVO vo);

}

