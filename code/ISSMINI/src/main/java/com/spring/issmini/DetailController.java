package com.spring.issmini;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.common.CommonUtil;
import com.spring.common.Pagination;
import com.spring.dto.AccDto;
import com.spring.dto.BoaDto;
import com.spring.info.BoardInfo;
import com.spring.service.BoardService;
import com.spring.service.CreateService;
import com.spring.service.DetailService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DetailController {

	@Autowired
	private BoardService boardService;
	@Autowired
	private DetailService detailService;
	@Autowired
	private CommonUtil com;
	
	
	@RequestMapping(value="i0004", method = RequestMethod.GET)
	public String ViewPage(Model model,
			@RequestParam() String user) {
		model.addAttribute("user", user);
		model.addAttribute("headerFlag", "board");
		
		return "i0004";
	}
	
	@RequestMapping(value="/back", method = RequestMethod.POST)
	public String back() throws Exception {
		return "i0003";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(BoardInfo info, Model model, HttpServletResponse response) throws Exception {

		detailService.boardUpdate(info);
		
		return "i0003";
		
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String delete(BoardInfo info, Model model, HttpServletResponse response) throws Exception {

		detailService.boardDelete(info);
		
		return "i0003";
		
	}
}
