package com.korea.test.DTO;

import com.korea.test.Board;
import lombok.Getter;

import java.util.List;

@Getter
public class BoardRequestDTO {
    private Long boardId;
    private String title;
    private String content;
    private String parentId;
}
