package com.spring.issmini;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.BoardDao;
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
	private BoardDao boardDao;

	@RequestMapping( value="/login.do", method=RequestMethod.POST )
	public String SignIn(AccDto accDto, BoaDto boadto, Model model, HttpServletRequest request ) {

		logger.info( "LOGIN" );

		HttpSession session = request.getSession(  );
		AccDto outAccDto = signInService.signIn( accDto );

		if ( outAccDto != null ) {

			session.setAttribute( "outAccDto", outAccDto );
			
			
			List<BoaDto> list = boardDao.selectAllBoard(boadto);
			model.addAttribute("boardlist",list);
			
			return "i0003";
			

		} else {

			String errorMsg = "���������ȪǪ���";
			session.setAttribute( "errorMsg", errorMsg );

			return "i0001";
		}
	}
}
