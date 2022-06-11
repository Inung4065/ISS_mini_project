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
public class DetailServiceImpl implements DetailService {

	@Autowired
	private BoardDao dao;

	@Override
	public void boardUpdate(BoardInfo info) throws Exception {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		
		BoaDto dto = new BoaDto();
		dto.setTitle(info.getTextTitle());
		dto.setContents(info.getTextContents());
		dto.setCreateTime(dateFormat.format(now));
		dto.setDeleteFlag(false);
		
		dao.updateBoard(dto);
	}

	@Override
	public void boardDelete(BoardInfo info) throws Exception {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		
		BoaDto dto = new BoaDto();
		dto.setCreateTime(dateFormat.format(now));
		dto.setDeleteFlag(true);
		
		dao.updateBoard(dto);
		
	}
}
