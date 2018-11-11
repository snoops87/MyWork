package com.board.example.dto;

import java.util.Date;

public class ReplyDTO {
	private Integer replyNo;	// ��� ��ȣ
	private Integer boardId;	// �Խñ� ��ȣ
	private String replyContent;	// ��� ����
	private String replyer;	// ��� �ۼ���
	private String userId;	// ��� �ۼ����� �̸�
	private Date regDate;	// ��� �ۼ�����
	private Date modDate;	// ��� ��������
	
	public Integer getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(Integer replyNo) {
		this.replyNo = replyNo;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}	
}
