package com.spring.issmini;

import java.util.Locale;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.CommonUtil;
import com.spring.dao.AccDao;
import com.spring.dto.AccDto;
import com.spring.info.SingUpInfo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignUpController {
	
	@Inject
	private SqlSessionTemplate session;
	@Autowired
	private MessageSource messageSource;
	private CommonUtil com = new CommonUtil();
	private String msg = "";
	
	
	@RequestMapping(value="i0002", method = RequestMethod.GET)
	public String ViewPage(Model model) {
		
		return "i0002";
	}
	
	@RequestMapping(value="i0002", method = RequestMethod.POST)
	public String SingUp(SingUpInfo info, Model model, HttpServletResponse response) throws Exception  {
		AccDao dao = new AccDao();
		
		if (!InputCheck(info, dao, session)) {
			model.addAttribute("id", info.getId());
			model.addAttribute("name", info.getName());
			
			com.alert(response, msg);
            
			return "i0002";
		}
		
		AccDto dto = new AccDto();
		dto.setAccountId(info.getId());
		dto.setAccountPassword(info.getPassword());
		dto.setAccountName(info.getName());
		
		dao.InsertAcc(dto, session);
		
		msg = messageSource.getMessage("IMI0002", null, Locale.JAPANESE);
		com.alert(response, msg);
		
		return "i0001";
	}
	
	private boolean InputCheck(SingUpInfo info, AccDao dao, SqlSessionTemplate session) {
		msg = "";
		
		if (info.getId() == "") msg = msg + "ID ";
		if (info.getPassword() == "") msg = msg + "PASSWORD ";
		if (info.getPasswordRe() == "") msg = msg + "PASSWORDRE ";
		if (info.getName() == "") msg = msg + "NAME ";
		if (msg != "") {
			msg = messageSource.getMessage("IME0004", new String[]{msg}, Locale.JAPANESE);
			return false;
		}
		
		if (info.getId().length() > 20) msg = msg + "ID ";
		if (info.getPassword().length() > 20) msg = msg + "PASSWORD ";
		if (info.getName().length() > 20) msg = msg + "NAME ";
		if (msg != "") {
			msg = messageSource.getMessage("IME0006", new String[]{msg,"20"}, Locale.JAPANESE);
			return false;
		}
		
		if (info.getPassword().length() < 6) {
			msg = messageSource.getMessage("IME0006", new String[]{"PASSWORD ","6"}, Locale.JAPANESE);
			return false;
		}

		AccDto dto = dao.SelectAccForAccountId(info.getId(), session);
		if (dto != null) {
			msg = messageSource.getMessage("IME0001", null, Locale.JAPANESE);
			return false;
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
			return false;
		}
		
		if (!info.getPassword().equals(info.getPasswordRe())) {
			msg = messageSource.getMessage("IME0003", null, Locale.JAPANESE);
			return false;
		}
		
		return true;
	}
	
}
