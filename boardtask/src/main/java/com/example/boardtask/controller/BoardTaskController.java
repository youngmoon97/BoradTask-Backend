package com.example.boardtask.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boardtask.model.BoardTaskVO;
import com.example.boardtask.service.BoardTaskService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardTaskController {
	private final BoardTaskService boardTaskService;
	
	@GetMapping(value="/getBoard")
	@ResponseBody
	public List<BoardTaskVO> getBoardList() {
//		log.info("getBoardList");
		List<BoardTaskVO> resultList = boardTaskService.getBoardList();
		return resultList;
	}
	@GetMapping(value="/getDetail")
	@ResponseBody
	public BoardTaskVO getBoardDetail(@RequestParam("boardIdx") Integer boardIdx) {
//		log.info("getBoardList");
		BoardTaskVO result = boardTaskService.getBoardDetail(boardIdx);
		Integer cntUp = boardTaskService.increaseCnt(boardIdx);
//		System.out.println("cntUP : "+cntUp);
		return result;
	}
	
	// 성공시 1 실패 0
	@PostMapping(value="/insertBoard")
	@ResponseBody
	public Integer insertBoard(@RequestBody BoardTaskVO boardTaskVO) {
		Integer result = boardTaskService.insertBoard(boardTaskVO);
		return result;
	}
	@PostMapping(value="/updateBoard")
	@ResponseBody
	public Integer updateBoard(@RequestBody BoardTaskVO boardTaskVO) {
		Integer result = boardTaskService.updateBoard(boardTaskVO);
		return result;
	}
	@PostMapping(value="/deleteBoard")
	@ResponseBody
	public Integer deleteBoard(@RequestBody BoardTaskVO boardTaskVO) {
		Integer result = boardTaskService.deleteBoard(boardTaskVO);
		return result;
	}
}
