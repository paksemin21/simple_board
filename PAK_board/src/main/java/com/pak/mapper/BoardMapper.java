package com.pak.mapper;

import java.util.List;

import com.pak.model.BoardVO;

public interface BoardMapper {

	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
	
	public int modify(BoardVO board);
	
	public int delete(int bno);
}
