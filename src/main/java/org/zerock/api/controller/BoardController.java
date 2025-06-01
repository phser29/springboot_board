package org.zerock.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoardController {
	
	@GetMapping("/")
	public String boardList() {
		
		return "index";
	}
	
}
