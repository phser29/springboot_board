package org.zerock.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.api.dto.FileVO;
import org.zerock.api.mapper.FileMapper;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileMapper fileMapper;
	
	@Override
	public List<FileVO> list() throws Exception {
		List<FileVO> fileList = fileMapper.list();
		return fileList;
	}

	@Override
	public FileVO select(String id) throws Exception {
		FileVO file = fileMapper.select(id);
		return file;
	}

	@Override
	public int insert(FileVO vo) throws Exception {
		int result = fileMapper.insert(vo);
		return result;
	}

	@Override
	public int update(FileVO vo) throws Exception {
		int result = fileMapper.update(vo);
		return result;
	}

	@Override
	public int delete(String id) throws Exception {
		int result = fileMapper.delete(id);
		return result;
	}
	
}
