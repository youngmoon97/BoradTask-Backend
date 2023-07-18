package com.example.boardtask.model;

import lombok.Data;

@Data
public class CommentVO {
	private Integer commentIdx;
	private String commentContents;
	private Integer boardIdx;
	private String commentDate;
	private String commentWriter;
}
