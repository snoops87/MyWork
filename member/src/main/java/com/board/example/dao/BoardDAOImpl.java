package com.board.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.example.dto.BoardDTO;

@Repository
public class BoardDAOImpl {
	@Autowired
	SqlSession sqlSession;
	// �Խ��� ��� �ҷ�����
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList"); 
	}
	// �Խù� �ۼ�
	public void write(BoardDTO dto) throws Exception {
		sqlSession.insert("board.write", dto);
	}
	// �Խù� �󼼳���
	public BoardDTO view(int boardId) throws Exception {
		return sqlSession.selectOne("board.view", boardId);
	}
	public void update(BoardDTO dto) throws Exception {
		sqlSession.update("board.update", dto);
	}
	public void delete(int boardId) throws Exception {
		sqlSession.delete("board.delete", boardId);		
	}
	
	
}
