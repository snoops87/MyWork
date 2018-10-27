package com.board.example.service;

import java.util.List;


import com.board.example.dto.BoardDTO;

public interface BoardService {
	// �Խ��� ��� ��ȸ
	public List<BoardDTO> boardList() throws Exception;
	// �Խ��� �۾���
	public void write(BoardDTO dto) throws Exception;
	// �Խù� �󼼳���
	public BoardDTO view(int boardId) throws Exception;
	
	// �Խù� ����
	public void update(BoardDTO dto) throws Exception;
	
	// �Խù� ����
	public void delete(int boardId) throws Exception;
	
}
