package com.it.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.it.domain.BoardVO;

public class BoardPage extends com.it.domain.PageVO {
	
	private List<BoardVO> list;
	
	public List<BoardVO> getList() {
		return list;
	}
	
	public void setList(List<BoardVO> list) {
		this.list = list;
	}
	
}