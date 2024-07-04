package com.korea.test;

import com.korea.test.DTO.BoardRequestDTO;
import com.korea.test.DTO.BoardResponseDTO;
import com.korea.test.Service.BoardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MultiService {
    private final BoardService boardService;

    @Transactional
    public BoardResponseDTO create(String title, String content, String parentTitle) {
        Board board = boardService.create(title, content, parentTitle);
        return BoardResponseDTO.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .parentId(board.getParent() != null ? board.getParent().getId() : null)
                .build();
    }
//
//    public BoardResponseDTO getBoard(Long id) {
//        Board board = boardService.getBoard(id);
//        if (board == null) {
//            throw new NoSuchElementException("not product");
//        }
//        return BoardResponseDTO.builder()
//                .title(board.getTitle()).content(board.getContent()).build();
//    }
//
//    public BoardResponseDTO update(BoardRequestDTO boardRequestDTO) {
//        Board board = boardService.getBoard(boardRequestDTO.getBoardId());
//        boardService.update(boardRequestDTO.getTitle(), boardRequestDTO.getContent(), boardRequestDTO.getParentId());
//
//
//        return BoardResponseDTO.builder()
//                .title(board.getTitle())
//                .content(board.getContent())
//                .parentId(board.getParent().getId())
//                .build();
//    }
//
//    public void delete(Long boardId) {
//        Board board = boardService.getBoard(boardId);
//        boardService.delete(board);
//    }
//
//    public List<BoardResponseDTO> getBoradList() {
//        List<Board> boardList = boardService.getBoardList();
//        List<BoardResponseDTO> boardResponseDTOList = new ArrayList<>();
//        for (Board board : boardList) {
//            BoardResponseDTO boardResponseDTO = this.getBoard(board.getId());
//            boardResponseDTOList.add(boardResponseDTO);
//        }
//        return boardResponseDTOList;
//    }


}
