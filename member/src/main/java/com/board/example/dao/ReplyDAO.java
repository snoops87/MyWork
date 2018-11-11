package com.board.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.example.dto.ReplyDTO;

@Repository
public class ReplyDAO {
	@Inject
	SqlSession sqlSession;
	
	// ��� ���
	public List<ReplyDTO> list(Integer boardId){
		return sqlSession.selectList("reply.listReply", boardId);
	}
	
	// ��� �ۼ�
	public void write(ReplyDTO dto) {
		sqlSession.insert("reply.insertReply", dto);
	}
	
	// ��� ����
	public void delete(Integer replyNo) {
		sqlSession.delete("reply.deleteReply", replyNo);
	}
	
	
}
