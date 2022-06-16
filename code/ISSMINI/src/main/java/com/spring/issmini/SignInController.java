package com.spring.issmini;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.CommonUtil;
import com.spring.common.Pagination;
import com.spring.dto.AccDto;
import com.spring.dto.BoaDto;
import com.spring.service.BoardService;
import com.spring.service.SignInService;

@Controller
public class SignInController {

	private Logger logger = LoggerFactory.getLogger(SignInController.class);

	@Autowired
	private SignInService signInService;
	@Autowired
	private BoardService boardService;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private CommonUtil com;
	
	//ログイン初期画面
	@RequestMapping( value="/login.do", method=RequestMethod.POST )
	public String SignIn(AccDto accDto, Model model, HttpServletRequest request, HttpServletResponse response ) throws Exception {

		logger.info( "LOGIN" );

		HttpSession session = request.getSession(  );
		AccDto outAccDto = signInService.signIn( accDto );
		
		//すべての項目が入力されてる場合
		if ( outAccDto != null ) {

			int listCnt = boardService.getBoardListCnt(  );

			Pagination pagination = new Pagination(  );
			pagination.pageInfo( 1, 1, listCnt );

			List<BoaDto> list = boardService.boardAll(pagination);

			model.addAttribute("pagination",pagination);
			model.addAttribute("boardlist",list);
			model.addAttribute("headerFlag", "board");
			model.addAttribute("user", accDto.getAccountId());
			
			return "i0003";

		}
		//エラーが発生した場合
		else {

			String msg = messageSource.getMessage("IME0005", null, Locale.JAPANESE);
			//メッセージ出力
			com.alert(response, msg);

			String requestId = accDto.getAccountId(  );
			session.setAttribute( "accId", requestId );

			return "i0001";
		}
	}
}
