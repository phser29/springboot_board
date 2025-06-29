package org.zerock.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.api.dto.FileVO;

@Mapper
public interface FileMapper {
	
	public List<FileVO> list() throws Exception;
	
	public FileVO select(String id) throws Exception;
	
	public int insert(FileVO vo) throws Exception;
	
	public int update(FileVO vo) throws Exception;
	
	public int delete(String id) throws Exception;
	
}
