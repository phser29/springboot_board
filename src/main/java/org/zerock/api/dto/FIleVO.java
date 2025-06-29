package org.zerock.api.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class FileVO {
	
	private int no;
	private String id;
	private String fileName;
	private String filePath;
	private long fileSize;
	private String type;
	private String parentTable;
	private String parentNo;
	private Date createAt;
	private Date updateAt;
	
}
