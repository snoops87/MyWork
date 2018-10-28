package com.board.example.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.example.dao.BoardDAOImpl;
import com.board.example.dto.BoardDTO;

@Service
public class BoardServiceImpl{
	@Inject
	BoardDAOImpl boardDao;

	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList(); 
	}

	public void write(BoardDTO dto) throws Exception {
		boardDao.write(dto);		
	}

	public BoardDTO view(int boardId) throws Exception {
		return boardDao.view(boardId);
	}

	public void update(BoardDTO dto) throws Exception {
		boardDao.update(dto);		
	}

	public void delete(int boardId) throws Exception {
		boardDao.delete(boardId);
		
	}
}
