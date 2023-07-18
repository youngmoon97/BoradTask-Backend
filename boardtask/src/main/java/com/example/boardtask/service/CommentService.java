package com.example.boardtask.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardtask.dao.CommentDAO;
import com.example.boardtask.model.CommentVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
	private final CommentDAO commentDAO;
	
	// 댓글 리스트 조회
	public List<CommentVO> getCommentList(Integer boardIdx){
		return commentDAO.getCommentList(boardIdx);
	}
	// 댓글 삽입
	public Integer insertComment(CommentVO commentVO){
		return commentDAO.insertComment(commentVO);
	}
}
