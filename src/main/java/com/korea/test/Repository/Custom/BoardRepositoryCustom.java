package com.korea.test.Repository.Custom;

import com.korea.test.Board;

import java.util.List;
import java.util.Optional;


public interface BoardRepositoryCustom {
    Board getBoard (Board parent);

    List<Board> boardList();
}
