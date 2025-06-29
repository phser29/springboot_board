package org.zerock.api.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BoardDTO {
	
	private int no;
	private String id;
	private String title;
	private String writer;
	private String content;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	
	private List<MultipartFile> fileList; // 파일 목록
	
	public BoardDTO() {
		this.id = UUID.randomUUID().toString();
	}
	
}
