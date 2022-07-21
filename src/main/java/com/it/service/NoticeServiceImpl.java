package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.service.BoardServiceImpl;

import com.it.mapper.BoardMapper;
import com.it.mapper.NoticeMapper;
import com.it.domain.NoticeVO;
import com.it.mapper.NoticePage;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
public class NoticeServiceImpl{
	
	private NoticeMapper mapper;
	
	@Autowired
	public NoticeServiceImpl(NoticeMapper mapper) {
		this.mapper = mapper;
	}
	
	public void notice_insert(NoticeVO vo) {
		mapper.insert(vo);
	}

	public List<NoticeVO> notice_list() {
		return mapper.list();
	}

	public NoticePage notice_list(NoticePage page) {
		int totalPage = mapper.totalList(page);
		List<NoticeVO> list = mapper.list(page);
		
		page.setTotalPage(totalPage);
		page.setList(list);
		
		return page;
	}

	public NoticeVO notice_detail(int id) {
		return mapper.detail(id);
	}

	public void notice_update(NoticeVO vo) {
		mapper.update(vo);
	}

	public void notice_delete(int id) {
		mapper.delete(id);
	}

	public void notice_read(int id) {
		mapper.read(id);
	}

	public void notice_reply_insert(NoticeVO vo) {
		mapper.replyInsert(vo);		
	}
}
