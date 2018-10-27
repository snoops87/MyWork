package com.board.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.example.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	SqlSession sqlSession;
	// �Խ��� ��� �ҷ�����
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList"); 
	}
	// �Խù� �ۼ�
	@Override
	public void write(BoardDTO dto) throws Exception {
		sqlSession.insert("board.write", dto);
	}
	// �Խù� �󼼳���
	@Override
	public BoardDTO view(int boardId) throws Exception {
		return sqlSession.selectOne("board.view", boardId);
	}
	@Override
	public void update(BoardDTO dto) throws Exception {
		sqlSession.update("board.update", dto);
	}
	@Override
	public void delete(int boardId) throws Exception {
		sqlSession.delete("board.delete", boardId);		
	}
}
