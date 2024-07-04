package com.korea.test;

import com.korea.test.DTO.BoardRequestDTO;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board parent;

//    @OneToMany(mappedBy = "parent", orphanRemoval = true)
//    private List<Board> children =new ArrayList<>();


    @Builder
    public Board(String title, String content, Board parent) {
        this.title = title;
        this.content = content;
        this.parent = parent;
    }
}
