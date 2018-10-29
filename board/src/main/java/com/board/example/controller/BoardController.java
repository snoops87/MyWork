package com.board.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.example.dto.BoardDTO;
import com.board.example.service.BoardServiceImpl;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	BoardServiceImpl boardServiceImpl;
	
	@RequestMapping("list.do")
	public String boardList(Model model) throws Exception {
		List<BoardDTO> list = boardServiceImpl.boardList(); // list ������ ��� ���� ��´�.
		model.addAttribute("list", list); // model�� ������ ���� ��´�.
		return "board/list"; // board/board_list.jsp�� �̵�.
	}
	
	 // write.jsp ����
	@RequestMapping("write")
	public String writePage() {
		return "board/write";
	}
	
	// �Խñ� form ������ ó��
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String write(BoardDTO dto) throws Exception{
		boardServiceImpl.write(dto);
		return "redirect:list.do";
	}
	
	// �Խñ� �󼼳���
	@RequestMapping(value="view.do", method=RequestMethod.GET)
	public String view(@RequestParam int boardId, Model model) throws Exception{
		BoardDTO dto = boardServiceImpl.view(boardId);		// boardId ���� �ѱ��.
		model.addAttribute("dto", dto);	// model�� ������ ���� ��´�.
		return "board/view";		// board/list.jsp�� �̵�.
	}
	
	// �Խñ� ���� �������� �̵�
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String update(@RequestParam int boardId, Model model) throws Exception{
		BoardDTO dto = boardServiceImpl.view(boardId);	// boardId���� �ѱ�.
		model.addAttribute("dto", dto);	// model�� ������ ���� ��´�.
		return "board/update";	// board/update.jsp�� �̵�
	}
	
	// �Խñ� ����
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String updateSave(BoardDTO dto) throws Exception{
		boardServiceImpl.update(dto);
		return "redirect:list.do";
	}
	
	// �Խñ� ����
	@RequestMapping(value="delete.do", method=RequestMethod.GET)
	public String delete(@RequestParam int boardId) throws Exception{
		boardServiceImpl.delete(boardId);
		return "redirect:list.do";
	}	
	
}