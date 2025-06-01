package org.zerock.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.api.mapper.BoardMapper;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoardServiceImpl {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
}
