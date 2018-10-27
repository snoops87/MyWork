package com.board.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.example.dto.BoardDTO;
import com.board.example.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	BoardService boardService;
	
	@RequestMapping("list.do")
	public String boardList(Model model) throws Exception {
		List<BoardDTO> list = boardService.boardList(); // list 변수에 결과 값을 담는다.
		model.addAttribute("list", list); // model에 데이터 값을 담는다.
		return "board/list"; // board/board_list.jsp로 이동.
	}
	
	 // write.jsp 매핑
	@RequestMapping("write")
	public String writePage() {
		return "board/write";
	}
	
	// 게시글 form 데이터 처리
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String write(BoardDTO dto) throws Exception{
		boardService.write(dto);
		return "redirect:list.do";
	}
	
	// 게시글 상세내용
	@RequestMapping(value="view.do", method=RequestMethod.GET)
	public String view(@RequestParam int boardId, Model model) throws Exception{
		BoardDTO dto = boardService.view(boardId);		// boardId 값을 넘긴다.
		model.addAttribute("dto", dto);	// model에 데이터 값을 담는다.
		return "board/view";		// board/list.jsp로 이동.
	}
	
	// 게시글 수정 페이지로 이동
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String update(@RequestParam int boardId, Model model) throws Exception{
		BoardDTO dto = boardService.view(boardId);	// boardId값을 넘김.
		model.addAttribute("dto", dto);	// model에 데이터 값을 담는다.
		return "board/update";	// board/update.jsp로 이동
	}
	
	// 게시글 수정
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String updateSave(BoardDTO dto) throws Exception{
		boardService.update(dto);
		return "redirect:list.do";
	}
	
	// 게시글 삭제
	@RequestMapping(value="delete.do", method=RequestMethod.GET)
	public String delete(@RequestParam int boardId) throws Exception{
		boardService.delete(boardId);
		return "redirect:list.do";
	}	
	
}