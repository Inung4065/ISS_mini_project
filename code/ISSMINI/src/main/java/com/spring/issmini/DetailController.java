package com.spring.issmini;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;
import com.spring.info.BoardInfo;
import com.spring.service.BoardService;
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
	
	//詳細初期画面
	@RequestMapping(value="i0004", method = RequestMethod.GET)
	public String ViewPage(Model model,
			@RequestParam() int no,
			@RequestParam() String user) throws Exception {

		BoaDto boardList = detailService.boardSelect( no );
		
		model.addAttribute("user", user);
		model.addAttribute("list", boardList);
		model.addAttribute("headerFlag", "board");
		
		return "i0004";
	}
	
	//以前画面に戻る
	@RequestMapping(value="/back", method = RequestMethod.POST)
	public String Back(BoardInfo info,
			Model model, HttpServletResponse response ) throws Exception {

		int listCnt = boardService.getBoardListCnt(  );

		Pagination pagination = new Pagination(  );
		pagination.pageInfo( 1, 1, listCnt );

		List<BoaDto> list = boardService.boardAll(pagination);

		model.addAttribute("pagination", pagination);
		model.addAttribute("boardlist", list);
		model.addAttribute("headerFlag", "board");
		model.addAttribute("user", info.getLoginUser());

		return "i0003";
	}
	
	//更新
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String Update(BoardInfo info,
			Model model, HttpServletResponse response ) throws Exception {

		detailService.boardUpdate(info);

		int listCnt = boardService.getBoardListCnt(  );

		Pagination pagination = new Pagination(  );
		pagination.pageInfo( 1, 1, listCnt );

		List<BoaDto> list = boardService.boardAll(pagination);

		model.addAttribute("pagination", pagination);
		model.addAttribute("boardlist", list);
		model.addAttribute("headerFlag", "board");
		model.addAttribute("user", info.getLoginUser());

		return "i0003";
		
	}
	
	//削除
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String Delete(BoardInfo info,
			Model model, HttpServletResponse response ) throws Exception {

		detailService.boardDelete(info);

		int listCnt = boardService.getBoardListCnt(  );

		Pagination pagination = new Pagination(  );
		pagination.pageInfo( 1, 1, listCnt );

		List<BoaDto> list = boardService.boardAll(pagination);

		model.addAttribute("pagination", pagination);
		model.addAttribute("boardlist", list);
		model.addAttribute("headerFlag", "board");
		model.addAttribute("user", info.getLoginUser());

		return "i0003";
	}
}
