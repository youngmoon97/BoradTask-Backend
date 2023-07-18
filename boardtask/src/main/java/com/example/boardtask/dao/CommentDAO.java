package com.example.boardtask.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.boardtask.model.CommentVO;

@Mapper
@Repository
public interface CommentDAO {
	
	List<CommentVO> getCommentList(Integer boardIdx);
	Integer insertComment(CommentVO commentVO);
}
