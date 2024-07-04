package com.korea.test.DTO;

import com.korea.test.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BoardResponseDTO {

    private String title;
    private String content;
    private Long parentId;
    private BoardResponseDTO boardResponseDTO;

    @Builder
    public BoardResponseDTO(String title, String content, Long parentId, BoardResponseDTO boardResponseDTO) {
        this.title = title;
        this.content = content;
        this.parentId = parentId;
        this.boardResponseDTO = boardResponseDTO;
    }
}
