package com.spring.issmini;

import java.util.Locale;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.common.CommonUtil;
import com.spring.dto.AccDto;
import com.spring.info.SignUpInfo;
import com.spring.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private CommonUtil com;
	
	//アカウント作成の初期画面
	@RequestMapping(value="i0002", method = RequestMethod.GET)
	public String ViewPage(Model model) {
		return "i0002";
	}
	
	//アカウント作成
	@RequestMapping(value="i0002", method = RequestMethod.POST)
	public String SingUp(SignUpInfo info, Model model, HttpServletResponse response) throws Exception {
		String msg = signUpService.inputCheck(info);
		//エラーが発生した場合
		if (msg != "") {
			model.addAttribute("id", info.getId());
			model.addAttribute("name", info.getName());
			
			//メッセージ出力
			com.alert(response, msg);
            
			return "i0002";
		}
		//エラーが発生してない場合
		else {
			AccDto dto = new AccDto();
			dto.setAccountId(info.getId());
			dto.setAccountPassword(info.getPassword());
			dto.setAccountName(info.getName());
			
			signUpService.accountAdd(dto);
			
			msg = messageSource.getMessage("IMI0002", null, Locale.JAPANESE);
			com.alert(response, msg);
			
			return "i0001";
		}

	}
	
}
