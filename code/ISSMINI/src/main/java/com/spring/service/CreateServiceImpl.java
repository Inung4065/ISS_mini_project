package com.spring.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.spring.dao.BoardDao;
import com.spring.dto.BoaDto;
import com.spring.info.BoardInfo;



@Service
public class CreateServiceImpl implements CreateService {

	@Autowired
	private MessageSource messageSource;
	@Autowired
	private BoardDao dao;
	
	//ìýÕô«Á«§«Ã«¯
	@Override
	public String inputCheck(BoardInfo info) {
		String msg = "";
		String msg2 = "";
		
		if (info.getTextTitle() == "") msg = msg + "«¿«¤«È«ë ";
		if (info.getTextContents() == "") msg = msg + "ÜâÙþ ";
		if (msg != "") {
			msg = messageSource.getMessage("IME0004", new String[]{msg}, Locale.JAPANESE);
			return msg;
		}
		
		if (info.getTextTitle().length() > 30) {
			msg = msg + "«¿«¤«È«ë ";
			msg2 = msg2 + "30 ";
		}
		if (info.getTextContents().length() > 1000) {
			msg = msg + "ÜâÙþ ";
			msg2 = msg2 + "1000 ";
		}
		if (msg != "") {
			msg = messageSource.getMessage("IME0006", new String[]{msg, msg2}, Locale.JAPANESE);
			return msg;
		}
		
		return msg;
	}
	
	//íÂà÷Ñ¦Òö
	@Override
	public void boardAdd(BoardInfo info) throws Exception {
		int no = dao.getBoardListCnt() + 1;
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		
		BoaDto dto = new BoaDto();
		
		dto.setNo(no);
		dto.setTitle(info.getTextTitle());
		dto.setContents(info.getTextContents());
		dto.setUser(info.getUser());
		dto.setCreateTime(dateFormat.format(now));
		dto.setDeleteFlag(false);
		
		dao.insertBoard(dto);
	}
}
