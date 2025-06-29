package org.zerock.api.service;

import java.util.List;

import org.zerock.api.dto.FileVO;

public interface FileService {
	
public List<FileVO> list() throws Exception;
	
	public FileVO select(String id) throws Exception;
	
	public int insert(FileVO vo) throws Exception;
	
	public int update(FileVO vo) throws Exception;
	
	public int delete(String id) throws Exception;
}
