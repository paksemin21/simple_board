package com.psm.service;

import com.psm.model.BoardVO;
import com.psm.model.Criteria;

import java.util.List;


public interface BoardService {

	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
	
	public int modify(BoardVO board);
	
	public int delete(int bno);
			
	public List<BoardVO> getListPaging(Criteria cri);
	
	public int getTotal(Criteria cri);
	
}
