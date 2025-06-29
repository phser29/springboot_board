package org.zerock.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.api.dto.BoardDTO;
import org.zerock.api.service.BoardService;

import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.list();
		model.addAttribute("boardList", boardList);
		return "/board/boardList";
	}
	
	@GetMapping("/select")
	public String select(@RequestParam("id") String id, Model model) throws Exception {
		BoardDTO boardDTO = boardService.select(id);
		model.addAttribute("boardDTO", boardDTO);
		return "/board/boardRead";
	}
	
	@GetMapping("/insert")
	public String insert() {
		
		return "/board/boardInsert";
	}
	
	@PostMapping("/insert")
	public String insertPost(BoardDTO boardDTO) throws Exception {
		log.info("boardDTO: " + boardDTO);
		int result = boardService.insert(boardDTO);
		
		if(result > 0) {
			return "redirect:/board/list";
		}
		return "redirect:/board/insert?error";
	}
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam("id") String id) throws Exception {
		BoardDTO boardDTO = boardService.select(id);
		model.addAttribute("boardDTO", boardDTO);
		return "/board/boardUpdate";
	}
	
	@PostMapping("/update")
	public String updatePost(BoardDTO boardDTO) throws Exception {
		int result = boardService.update(boardDTO);
		if(result > 0) {
			return "redirect:/board/list";
		}
		return "redirect:/board/update?error" + boardDTO.getId();
	}
	
	@PostMapping("/delete")
	public String deletePost(@RequestParam("id") String id) throws Exception {
		int result = boardService.delete(id);
		if(result > 0) {
			return "redirect:/board/list";
		}
		return "redirect:/board/update?error&id="+id;
	}
	
}
