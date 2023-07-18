package com.example.boardtask.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boardtask.model.CommentVO;
import com.example.boardtask.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CommentController {
	private final CommentService commentService;
	
	@GetMapping(value="/getcommentlist")
	@ResponseBody
	public List<CommentVO> getCommentList(@RequestParam("boardIdx") Integer boardIdx) {
//		log.info("getBoardList");
		List<CommentVO> resultList = commentService.getCommentList(boardIdx);
//		System.out.println(resultList);
		return resultList;
	}
	// 
	@PostMapping(value="/insertcomment")
	@ResponseBody
	public Integer insertComment(@RequestBody CommentVO commentVO) {
		Integer result = commentService.insertComment(commentVO);
		return result;
	}
}
