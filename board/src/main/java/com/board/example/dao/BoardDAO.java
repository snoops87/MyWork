package com.board.example.dao;

import java.util.List;


import com.board.example.dto.BoardDTO;

public interface BoardDAO {
	// 게시판 목록보기
	public List<BoardDTO> boardList() throws Exception;
	// 게시물 작성
	public void write(BoardDTO dto) throws Exception;
	// 게시물 상세내용
	public BoardDTO view(int boardId) throws Exception;
	// 게시물 수정
	public void update(BoardDTO dto) throws Exception;
	// 게시물 삭제
	public void delete(int boardId) throws Exception;
		
}