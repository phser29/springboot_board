package org.zerock.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.api.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	
	public List<BoardDTO> list() throws Exception;
	
	public BoardDTO select(String id) throws Exception;
	
	public int insert(BoardDTO boardDTO) throws Exception;
	
	public int update(BoardDTO boardDTO) throws Exception;
	
	public int delete(String id) throws Exception;
	
}
