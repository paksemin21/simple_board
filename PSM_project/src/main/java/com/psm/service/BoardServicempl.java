package com.psm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psm.mapper.BoardMapper;
import com.psm.model.BoardVO;
import com.psm.model.Criteria;
@Service
public class BoardServicempl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVO board) {
		mapper.enroll(board);
	}
	
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
	
	@Override
	public BoardVO getPage(int bno) {
		return mapper.getPage(bno);
	}
	
	@Override
	public int modify(BoardVO board) {
		
		return mapper.modify(board);
	}
	
	@Override
	public int delete(int bno) {
		
		return mapper.delete(bno);
	}
	
	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		
		return mapper.getListPaging(cri);
		
	}
	
	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
}
