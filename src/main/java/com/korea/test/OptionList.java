package com.korea.test;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OptionList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    @Builder
    public OptionList(String name, Board board) {
        this.name = name;
        this.board = board;
    }

}
