package io.playdata.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.playdata.board.dto.BoardDTO;
import io.playdata.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public int insert(BoardDTO dto) {
		return boardRepository.insert(dto);
	}

	@Override
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}

}
