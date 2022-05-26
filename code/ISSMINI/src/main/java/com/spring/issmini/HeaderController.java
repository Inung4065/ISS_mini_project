package com.spring.issmini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;
import com.spring.service.BoardService;

@Controller
public class HeaderController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board", method=RequestMethod.GET )
	public String HeaderBoard(Model model,
			@RequestParam() String user) throws Exception {
		int listCnt = boardService.getBoardListCnt(  );
		
		Pagination pagination = new Pagination();
		pagination.pageInfo( 1, 1, listCnt );
		
		List<BoaDto> list = boardService.boardAll(pagination);
		model.addAttribute("pagination",pagination);
		model.addAttribute("boardlist",list);
		model.addAttribute("headerFlag", "board");
		model.addAttribute("user", user);
		
		return "i0003";
	}
}
