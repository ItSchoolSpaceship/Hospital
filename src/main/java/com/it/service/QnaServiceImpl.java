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
	
	public void qna_insert(QnaVO vo) {
		mapper.insert(vo);
	}

	
	public List<QnaVO> qna_list() {
		return mapper.list();
	}

	
	public QnaVO qna_detail(int id) {
		return mapper.detail(id);
	}

	
	public void qna_update(QnaVO vo) {
		mapper.update(vo);
	}

	
	public void qna_delete(int id) {
		mapper.delete(id);
	}

	
	public void qna_read(int id) {
		mapper.read(id);
	}

	
	public void qna_reply_insert(QnaVO vo) {
		mapper.reply_insert(vo);
	}

	
	public QnaPage qna_list(QnaPage page) {
		int totalPage = mapper.totalList(page);
		List<QnaVO> list = mapper.list(page);
		
		page.setTotalList(totalPage);
		page.setList(list);
		
		return page;
	}

}