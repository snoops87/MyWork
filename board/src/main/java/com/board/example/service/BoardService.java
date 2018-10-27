package com.board.example.service;

import java.util.List;


import com.board.example.dto.BoardDTO;

public interface BoardService {
	// 게시판 목록 조회
	public List<BoardDTO> boardList() throws Exception;
	// 게시판 글쓰기
	public void write(BoardDTO dto) throws Exception;
	// 게시물 상세내용
	public BoardDTO view(int boardId) throws Exception;
	
	// 게시물 수정
	public void update(BoardDTO dto) throws Exception;
	
	// 게시물 삭제
	public void delete(int boardId) throws Exception;
	
}
