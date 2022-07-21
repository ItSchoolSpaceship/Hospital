package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.domain.BoardCommentVO;
import com.it.domain.BoardVO;
import com.it.domain.PageVO;
import com.it.mapper.BoardMapper;
import com.it.mapper.BoardPage;

@Service
public class BoardServiceImpl {

	
	private BoardMapper mapper;

	@Autowired
	public BoardServiceImpl(BoardMapper mapper) {
		this.mapper = mapper;
	}
	
	public int board_insert(BoardVO vo) {
		return mapper.insert(vo);
	}
	

	  public BoardPage board_list(BoardPage page) {
	 
		int totalPage = mapper.total(page);
		List<BoardVO> list = mapper.list(page);
		
		page.setTotalPage(totalPage);
		page.setList(list);
		
		return page;
	}

	
	/*
	public List<BoardVO> board_list(PageVO page){
		return mapper.list(page);
	}
	*/
	
	public BoardVO board_detail(int id) {
		return mapper.detail(id);
	}
	
	public void board_read(int id) {
		mapper.read(id);
	}
	
	public int board_update(BoardVO vo) {
		return mapper.update(vo);
	}
	
	public int board_delete(int id) {
		return mapper.delete(id);
	}
	
	public int board_comment_insert(BoardCommentVO vo) {
		return mapper.comment_insert(vo);
	}
	
	public List<BoardCommentVO> board_comment_list(int pid){
		return mapper.comment_list(pid);
	}
	
	public int board_comment_update(BoardCommentVO vo) {
		return mapper.comment_update(vo);
	}
	
	public int board_comment_delete(int id) {
		return mapper.comment_delete(id);
}
}
