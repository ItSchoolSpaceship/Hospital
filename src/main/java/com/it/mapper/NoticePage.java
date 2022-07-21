package com.it.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.it.domain.NoticeVO;
import com.it.domain.PageVO;


public class NoticePage extends PageVO {
	private List<NoticeVO> list;

	public List<NoticeVO> getList() {
		return list;
	}

	public void setList(List<NoticeVO> list) {
		this.list = list;
	}
	
	
}