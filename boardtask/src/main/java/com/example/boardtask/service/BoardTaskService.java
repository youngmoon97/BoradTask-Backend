package com.example.boardtask.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardtask.dao.BoardTaskDAO;
import com.example.boardtask.model.BoardTaskVO;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardTaskService {
private final BoardTaskDAO boardTaskDAO;
	
	// 게시판 리스트 조회
	public List<BoardTaskVO> getBoardList(){
		return boardTaskDAO.getBoardList();
	}
	// 
	public BoardTaskVO getBoardDetail(Integer boardIdx) {
		return boardTaskDAO.getBoardDetail(boardIdx);
	}
	
	// 
	public Integer insertBoard(BoardTaskVO boardTaskVO) {
		Integer result = boardTaskDAO.insertBoard(boardTaskVO);
		return result;
	}
	public Integer updateBoard(BoardTaskVO boardTaskVO) {
		Integer result = boardTaskDAO.updateBoard(boardTaskVO);
		return result;
	}
	public Integer deleteBoard(BoardTaskVO boardTaskVO) {
		Integer result = boardTaskDAO.deleteBoard(boardTaskVO);
		return result;
	}
}
