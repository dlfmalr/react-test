package com.korea.test.Service;


import com.korea.test.Board;
import com.korea.test.DataNotFoundException;
import com.korea.test.Repository.BoardRepository;
import com.korea.test.Repository.OptionListRepository;
import com.korea.test.Repository.OptionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final OptionListRepository optionListRepository;
    private final OptionsRepository optionsRepository;

    public Board create(String title, String content, String parentId) {

        Board board = this.getBoard(parentId);

        return boardRepository.save(Board.builder()
                .title(title)
                .content(content)
                .parent(board)
                .build());

    }


    public Board getBoard(String parentId) {

        Optional<Board> parent = this.boardRepository.findByTitle(parentId);
        if (parent.isPresent()) {
            return boardRepository.getBoard(parent.get());
        }
        return null;
    }


    public Board update(String title, String content, Long boardId) {
        Optional<Board> parent = boardRepository.findById(boardId);
        return boardRepository.save(Board.builder()
                .title(title)
                .content(content)
                .parent(parent.orElse(null))
                .build());

    }

    public void delete(Board board) {
        this.boardRepository.delete(board);
    }

    public List<Board> getBoardList() {
        return boardRepository.boardList();
    }


}
