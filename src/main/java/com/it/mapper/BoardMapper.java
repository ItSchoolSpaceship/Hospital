package com.it.mapper;

import java.util.List;

import com.it.domain.BoardCommentVO;
import com.it.domain.BoardVO;

public interface BoardMapper {
	
	public int insert(BoardVO vo);
	
	public List<BoardVO> list(BoardPage page);
	
	public BoardVO detail(int id);
	
	public void read(int id);
	
	public int update(BoardVO vo);
	
	public int delete(int id);
	
	public int total(BoardPage page);
	
	public int commentInsert(BoardCommentVO vo);
	
	public List<BoardCommentVO> commentList (int pid);
	
	public int commentUpdate(BoardCommentVO vo);
	
	public int commentDelete(int id);
	
}
