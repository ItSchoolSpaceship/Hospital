package com.it.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.it.domain.PageVO;
import com.it.domain.QnaVO;

public class QnaPage extends com.it.domain.PageVO {
	
	private List<QnaVO> list;

	public List<QnaVO> getList() {
		return list;
	}

	public void setList(List<QnaVO> list) {
		this.list = list;
	}

}