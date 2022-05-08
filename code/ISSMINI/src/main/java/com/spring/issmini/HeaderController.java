package com.spring.issmini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.BoaDto;
import com.spring.service.BoardService;

@Controller
public class HeaderController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board", method=RequestMethod.POST )
	public String HeaderBoard(Model model) throws Exception {
		List<BoaDto> list = boardService.boardAll();
		model.addAttribute("boardlist",list);
		model.addAttribute("headerFlag", "board");
		
		return "i0003";
	}
}
