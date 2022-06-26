package com.spring.service;

import java.util.Locale;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.spring.dao.SignUpDao;
import com.spring.dto.AccDto;
import com.spring.info.SignUpInfo;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private MessageSource messageSource;
	@Autowired
	private SignUpDao dao;
	
	//Insert
	@Override
	public void accountAdd(AccDto dto) throws Exception {
		dao.insertAcc(dto);
	}
	
	//ìýÕô«Á«§«Ã«¯
	@Override
	public String inputCheck(SignUpInfo info) {
		String msg = "";
		
		if (info.getId() == "") msg = msg + "ID ";
		if (info.getPassword() == "") msg = msg + "PASSWORD ";
		if (info.getPasswordRe() == "") msg = msg + "PASSWORDRE ";
		if (info.getName() == "") msg = msg + "NAME ";
		if (msg != "") {
			msg = messageSource.getMessage("IME0004", new String[]{msg}, Locale.JAPANESE);
			return msg;
		}
		
		if (info.getId().length() > 20) msg = msg + "ID ";
		if (info.getPassword().length() > 20) msg = msg + "PASSWORD ";
		if (info.getName().length() > 20) msg = msg + "NAME ";
		if (msg != "") {
			msg = messageSource.getMessage("IME0006", new String[]{msg,"20"}, Locale.JAPANESE);
			return msg;
		}
		
		if (info.getPassword().length() < 6) {
			msg = messageSource.getMessage("IME0006", new String[]{"PASSWORD ","6"}, Locale.JAPANESE);
			return msg;
		}

		AccDto dto = dao.selectAccForAccountId(info.getId());
		if (dto != null) {
			msg = messageSource.getMessage("IME0001", null, Locale.JAPANESE);
			return msg;
		}
		
		int count = 0;
		if (Pattern.compile("[A-Z]").matcher((info.getPassword())).find()) {
			count++;
		}
		if (Pattern.compile("[a-z]").matcher((info.getPassword())).find()) {
			count++;
		}
		if (Pattern.compile("[0-9]").matcher((info.getPassword())).find()) {
			count++;
		}
		if (Pattern.compile("[!@#$%^&*()]").matcher((info.getPassword())).find()) {
			count++;
		}
		if (count < 3) {
			msg = messageSource.getMessage("IME0002", null, Locale.JAPANESE);
			return msg;
		}
		
		if (!info.getPassword().equals(info.getPasswordRe())) {
			msg = messageSource.getMessage("IME0003", null, Locale.JAPANESE);
			return msg;
		}
		
		return msg;
	}
}
