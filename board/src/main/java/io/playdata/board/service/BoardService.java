package io.playdata.board.service;

import java.util.List;

import io.playdata.board.dto.BoardDTO;

public interface BoardService {
	int insert(BoardDTO dto);
	List<BoardDTO> findAll();
	BoardDTO findOne(Integer id);
	Integer deleteById(Integer id);
}
