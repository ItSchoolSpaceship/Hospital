package com.it.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.it.domain.QnaVO;
import com.it.mapper.QnaMapper;
import com.it.mapper.QnaPage;

@Service
public class QnaServiceImpl{
	
	private QnaMapper mapper;
	
	@Autowired
	public QnaServiceImpl(QnaMapper mapper) {
		this.mapper=mapper;
	}
	
	public void qnaInsert(QnaVO vo) {
		mapper.insert(vo);
	}

	
	public List<QnaVO> qnaList() {
		return mapper.list();
	}

	
	public QnaVO qnaDetail(int id) {
		return mapper.detail(id);
	}

	
	public void qnaUpdate(QnaVO vo) {
		mapper.update(vo);
	}

	
	public void qnaDelete(int id) {
		mapper.delete(id);
	}

	
	public void qnaRead(int id) {
		mapper.read(id);
	}

	
	public void qnaReplyInsert(QnaVO vo) {
		mapper.replyInsert(vo);
	}

	
	public QnaPage qnaList(QnaPage page) {
		//int totalPage = mapper.totalList(page);
		//List<QnaVO> list = mapper.list(page);
		
		page.setTotalList(mapper.totalList(page));
		page.setList(mapper.list(page));
		
		return page;
	}

}