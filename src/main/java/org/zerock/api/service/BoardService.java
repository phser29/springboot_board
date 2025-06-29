package org.zerock.api.service;

import java.util.List;

import org.zerock.api.dto.BoardDTO;

public interface BoardService {
	
public List<BoardDTO> list() throws Exception;
	
	public BoardDTO select(String id) throws Exception;
	
	public int insert(BoardDTO boardDTO) throws Exception;
	
	public int update(BoardDTO boardDTO) throws Exception;
	
	public int delete(String id) throws Exception;
}
