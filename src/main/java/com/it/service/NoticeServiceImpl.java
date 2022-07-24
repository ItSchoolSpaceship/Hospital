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
	
	public void noticeInsert(NoticeVO vo) {
		mapper.insert(vo);
	}

	public List<NoticeVO> noticeList() {
		return mapper.list();
	}

	public NoticePage notice_list(NoticePage page) {
		//int totalPage = mapper.totalList(page);
		//List<NoticeVO> list = mapper.list(page);
		
		page.setTotalList(mapper.totalList(page));
		page.setList(mapper.list(page));
		
		return page;
	}

	public NoticeVO noticeDetail(int id) {
		return mapper.detail(id);
	}

	public void noticeUpdate(NoticeVO vo) {
		mapper.update(vo);
	}

	public void noticeDelete(int id) {
		mapper.delete(id);
	}

	public void noticeRead(int id) {
		mapper.read(id);
	}

	public void noticeReplyInsert(NoticeVO vo) {
		mapper.replyInsert(vo);		
	}
	
}
