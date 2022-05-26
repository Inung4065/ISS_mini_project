package com.spring.issmini;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.spring.dto.BoaDto;
import com.spring.info.BoardInfo;
import com.spring.service.BoardService;
import com.spring.service.CreateService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CreateController {

	@Autowired
	private BoardService boardService;
	@Autowired
	private CreateService createService;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private CommonUtil com;
	
	
	@RequestMapping(value="/create.do", method = RequestMethod.GET)
	public String ViewPage(Model model,
			@RequestParam() String user) {
		model.addAttribute("user", user);
		
		return "i0005";
	}
	
	@RequestMapping(value="/create.do", method = RequestMethod.POST)
	public String SingUp(BoardInfo info, Model model, HttpServletResponse response) throws Exception {
		String msg = createService.inputCheck(info);
		if (msg != "") {
			model.addAttribute("user", info.getUser());
			model.addAttribute("textTitle", info.getTextTitle());
			model.addAttribute("textContents", info.getTextContents());
			
			com.alert(response, msg);
            
			return "i0005";
		} else {
			createService.boardAdd(info);
			
			msg = messageSource.getMessage("IMI0004", null, Locale.JAPANESE);
			com.alert(response, msg);
			
			int listCnt = boardService.getBoardListCnt();
			
			Pagination pagination = new Pagination();
			pagination.pageInfo(1, 1, listCnt);
			
			List<BoaDto> list = boardService.boardAll(pagination);
			model.addAttribute( "pagination", pagination );
			model.addAttribute("boardlist",list);
			model.addAttribute("headerFlag", "board");
			model.addAttribute("user", info.getUser());
			
			return "i0003";
		}
	}
}
