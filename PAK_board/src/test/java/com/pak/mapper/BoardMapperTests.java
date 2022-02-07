package com.pak.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.pak.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	
    private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
    
	
	  @Autowired private BoardMapper mapper;
	 /*
	 * @Test public void testEnroll() {
	 * 
	 * BoardVO vo = new BoardVO();
	 * 
	 * vo.setTitle("mapper test"); vo.setContent("mapper test");
	 * vo.setWriter("mapper test");
	 * 
	 * mapper.enroll(vo);
	 * 
	 * }
	 */
    
		/*
		 * @Test public void testGetList() {
		 * 
		 * List list = mapper.getList();
		 * 
		 * for(Object a : list) { log.info("" + a); }
		 * 
		 * }
		 */
    
		/*
		 * @Test public void testGetPage() {
		 * 
		 * 
		 * int bno = 8;
		 * 
		 * log.info("" + mapper.getPage(bno));
		 * 
		 * }
		 */
	  
		/*
		 * @Test public void testModify() {
		 * 
		 * BoardVO board = new BoardVO(); board.setBno(8); board.setTitle("수정내용");
		 * board.setContent("수정했습니다.");
		 * 
		 * int result = mapper.modify(board); log.info("result = " + result); }
		 */
	  
	  	@Test
	  		public void testDelete() {
	  		
	  		int result = mapper.delete(2);
	  		log.info("result : " + result);
	  	}
}
