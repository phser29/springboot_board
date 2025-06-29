package org.zerock.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.api.dto.BoardDTO;
import org.zerock.api.mapper.BoardMapper;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardDTO> list() throws Exception {
		List<BoardDTO> list = boardMapper.list();
		return list;
	}

	@Override
	public BoardDTO select(String id) throws Exception {
		BoardDTO select = boardMapper.select(id);
		return select;
	}

	@Override
	public int insert(BoardDTO boardDTO) throws Exception {
		int insert = boardMapper.insert(boardDTO);
		return insert;
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		int update = boardMapper.update(boardDTO);
		return update;
	}

	@Override
	public int delete(String id) throws Exception {
		int delete = boardMapper.delete(id);
		return delete;
	}
	
	
}
