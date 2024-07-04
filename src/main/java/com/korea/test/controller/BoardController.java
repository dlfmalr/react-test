package com.korea.test.controller;

import com.korea.test.DTO.BoardRequestDTO;
import com.korea.test.DTO.BoardResponseDTO;
import com.korea.test.MultiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {
//    public void as() {
//        System.out.printf("123113");
//    }

    private final MultiService multiService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BoardRequestDTO boardRequestDTO) {
        BoardResponseDTO boardResponseDTO = multiService.create(boardRequestDTO.getTitle(), boardRequestDTO.getContent(), boardRequestDTO.getParentId());
        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDTO);
    }
//
//    @PutMapping
//    public ResponseEntity<?> update(@RequestBody BoardRequestDTO boardRequestDTO) {
//        BoardResponseDTO boardResponseDTO = multiService.update(boardRequestDTO);
//        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDTO);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<?> delete(@RequestHeader("boardId") Long boardId) {
//        this.multiService.delete(boardId);
//        return ResponseEntity.status(HttpStatus.OK).body("not data");
//    }
//
//    @GetMapping
//    public ResponseEntity<?> detail(@RequestHeader("boardId") Long boardId) {
//        BoardResponseDTO boardResponseDTO = multiService.getBoard(boardId);
//        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDTO);
//    }
//
//    @GetMapping("/list")
//    public ResponseEntity<?> list() {
//        try {
//            List<BoardResponseDTO> boardResponseDTOList = multiService.getBoradList();
//            return ResponseEntity.status(HttpStatus.OK).body(boardResponseDTOList);
//        } catch (IllegalArgumentException e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not boardList");
//        }
//    }
}
