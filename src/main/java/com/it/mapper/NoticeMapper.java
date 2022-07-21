package com.it.mapper;

import java.util.List;


import com.it.domain.NoticeVO;

public interface NoticeMapper {
	
	public List<NoticeVO> list(NoticePage page);
	
	public List<NoticeVO> list();
	
	public int totalList (NoticePage page);
	
	public void insert(NoticeVO vo);
	
	public NoticeVO detail(int id);
	
	public void read(int id);
	
	public void delete(int id);
	
	public void update(NoticeVO vo);
	
	public void replyInsert(NoticeVO vo);

}
