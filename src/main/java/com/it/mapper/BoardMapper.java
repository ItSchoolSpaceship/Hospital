package com.it.mapper;

import java.util.List;

import com.it.domain.BoardCommentVO;
import com.it.domain.BoardVO;

public interface BoardMapper {
	
	public int insert(BoardVO vo);
	
	public List<BoardVO> list(BoardPage boardPage);
	
	public BoardVO detail(int id);
	
	public void read(int id);
	
	public int update(BoardVO vo);
	
	public int delete(int id);
	
	public int total(BoardPage boardPage);
	
	public int comment_insert(BoardCommentVO vo);
	
	public List<BoardCommentVO> comment_list (int pid);
	
	public int comment_update(BoardCommentVO vo);
	
	public int comment_delete(int id);
	
	
	
	
}
