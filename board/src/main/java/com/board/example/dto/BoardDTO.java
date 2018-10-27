package com.board.example.dto;

import java.util.Date;

public class BoardDTO {
	
	private int boardId;		
	private String title;
	private String content;
	private Date regDate;	
	private Date modDate;	
	
	public BoardDTO() {}
	public BoardDTO(int boardId, String title, String content, Date regDate, Date modDate) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.modDate = modDate;
	}
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getmodDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	//toString
	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", title=" + title + ", content=" + content  + ", regDate=" + regDate + ", modDate=" + modDate + "]";
	}

}