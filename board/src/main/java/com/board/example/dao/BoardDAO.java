package com.board.example.dao;

import java.util.List;


import com.board.example.dto.BoardDTO;

public interface BoardDAO {
	// �Խ��� ��Ϻ���
	public List<BoardDTO> boardList() throws Exception;
	// �Խù� �ۼ�
	public void write(BoardDTO dto) throws Exception;
	// �Խù� �󼼳���
	public BoardDTO view(int boardId) throws Exception;
	// �Խù� ����
	public void update(BoardDTO dto) throws Exception;
	// �Խù� ����
	public void delete(int boardId) throws Exception;
		
}