package com.example.boardtask.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.boardtask.model.BoardTaskVO;

@Mapper
@Repository
public interface BoardTaskDAO {
	
	// 게시판 리스트 조회
	List<BoardTaskVO> getBoardList();
	// 게시판 디테일 조회
	BoardTaskVO getBoardDetail(Integer boardIdx);
	// 게시판 조회수 증가
	Integer increaseCnt(Integer boardIdx);
	// 게시판 등록 수정 삭제
	Integer insertBoard(BoardTaskVO boardTaskVO);
	Integer updateBoard(BoardTaskVO boardTaskVO);
	Integer deleteBoard(BoardTaskVO boardTaskVO);
}
