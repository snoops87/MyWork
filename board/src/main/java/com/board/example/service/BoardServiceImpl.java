package com.board.example.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.example.dao.BoardDAO;
import com.board.example.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO boardDao;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList(); 
	}

	@Override
	public void write(BoardDTO dto) throws Exception {
		boardDao.write(dto);		
	}

	@Override
	public BoardDTO view(int boardId) throws Exception {
		return boardDao.view(boardId);
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		boardDao.update(dto);		
	}

	@Override
	public void delete(int boardId) throws Exception {
		boardDao.delete(boardId);
		
	}
}
