package com.spring.issmini;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.AccDto;
import com.spring.service.SignInService;

@Controller
public class SignInController {

	private Logger logger = LoggerFactory.getLogger(SignInController.class);

	@Autowired
	private SignInService signInService;

	@RequestMapping( value="/login.do", method=RequestMethod.POST )
	public String SignIn( AccDto accDto, HttpServletRequest request ) {

		logger.info( "LOGIN" );

		HttpSession session = request.getSession(  );
		AccDto outAccDto = signInService.signIn( accDto );

		if ( outAccDto != null ) {

			session.setAttribute( "outAccDto", outAccDto );

			return "i0003";

		} else {

			String errorMsg = "���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
			session.setAttribute( "errorMsg", errorMsg );

			return "i0001";
		}
	}
}
