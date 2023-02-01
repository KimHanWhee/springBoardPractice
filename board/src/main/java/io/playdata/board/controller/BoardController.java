package io.playdata.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import io.playdata.board.dto.BoardDTO;
import io.playdata.board.service.BoardServiceImpl;

@Controller
public class BoardController {
	@Autowired
	BoardServiceImpl boardService;
	
	@RequestMapping(value="/board/home", method = RequestMethod.GET)
	public ModelAndView home() {
		List<BoardDTO> allBoards = boardService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/home");
		mav.addObject("boards", allBoards);
		return mav;
		
	}
	
	@RequestMapping(value="/board/create", method = RequestMethod.GET)
	public String create() {	
		return "/board/create";
	}
	
	@RequestMapping(value="/board/create", method = RequestMethod.POST)
	public ModelAndView createPost(
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			@RequestParam("userName") String userName
			) {	
		BoardDTO dto = new BoardDTO(title, content, userName);
		int insertRows = boardService.insert(dto);
		ModelAndView mav = new ModelAndView();
		if(insertRows==0) {
			mav.setViewName("redirect:/board/create");
		}else {
			mav.setViewName("redirect:/board/home");
		}
		return mav;
	}
	
	@RequestMapping(value="/board/detail", method = RequestMethod.GET)
	public String detail() {
		return "/board/detail";
	}
}
