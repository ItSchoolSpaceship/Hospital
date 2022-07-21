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
	
	public int boardInsert(BoardVO vo) {
		return mapper.insert(vo);
	}
	
 public BoardPage boardList(BoardPage page) {
  
	int totalPage = mapper.total(page); 
	List<BoardVO> list = mapper.list(page);
  
  page.setTotalPage(totalPage); 
  page.setList(list);
  
  return page; 
	}
	
	public BoardVO boardDetail(int id) {
		return mapper.detail(id);
	}
	
	public void boardRead(int id) {
		mapper.read(id);
	}
	
	public int boardUpdate(BoardVO vo) {
		return mapper.update(vo);
	}
	
	public int boardDelete(int id) {
		return mapper.delete(id);
	}
	
	public int boardCommentInsert(BoardCommentVO vo) {
		return mapper.commentInsert(vo);
	}
	
	public List<BoardCommentVO> boardCommentList(int pid){
		return mapper.commentList(pid);
	}
	
	public int board_comment_update(BoardCommentVO vo) {
		return mapper.commentUpdate(vo);
	}
	
	public int board_comment_delete(int id) {
		return mapper.commentDelete(id);
}
	
}
