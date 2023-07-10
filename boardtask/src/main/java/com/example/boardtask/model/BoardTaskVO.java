package com.example.boardtask.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BoardTaskVO {
	private Integer boardIdx;
	private String boardTitle;
	private String boardContents;
	private Integer boardCnt;
	private String boardWriter;
	private LocalDateTime insertDate;
	private LocalDateTime updateDate;
	
	
}
