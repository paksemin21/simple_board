package com.pak.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pak.model.BoardVO;
import com.pak.service.BoardService;
import com.pak.model.Criteria;
import com.pak.model.PageMakerDTO;


@Controller
@RequestMapping("/board/")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
	
	@GetMapping("/list")
	public void boardListGET(Model model, Criteria cri) {
		
		log.info("boardListGET");
		
		model.addAttribute("list", bservice.getListPaging(cri));
		
		
		  int total = bservice.getTotal(cri);
		  
		  PageMakerDTO pageMaker = new PageMakerDTO(cri, total);
		 
		  model.addAttribute("pageMaker", pageMaker);
		 
		
		
 	}
	
	@GetMapping("/enroll")
	public void boardEnrollGET() {
		
		log.info("게시판 등록");
		
	}
	
	@GetMapping("/get") 
	public void boardGetPageGET(int bno, Model model, Criteria cri) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
		
		model.addAttribute("cri", cri);
	}
	

	@GetMapping("/modify")
	public void boardModifyGET(int bno, Model model) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
		
		
	}
	
	
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		
		log.info("BoardVO : " + board);
		
		bservice.enroll(board);
		
		rttr.addFlashAttribute("result", "enroll success");

		return "redirect:/board/list";
	}
	
	
	@PostMapping("/modify")
	public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
		
		bservice.modify(board);
		
		rttr.addFlashAttribute("result", "modify success");
		
		return "redirect:/board/list";
		
	}
	
	@PostMapping("/delete")
	public String boardDeletePOST(int bno, RedirectAttributes rttr) {
		
		bservice.delete(bno);
		
		rttr.addFlashAttribute("result", "delete success");
		
		return "redirect:/board/list";
		
	}
	
}
