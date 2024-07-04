package com.korea.test.Repository.Custom.Impl;

import com.korea.test.Board;
import com.korea.test.QBoard;
import com.korea.test.Repository.Custom.BoardRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    QBoard qBoard = QBoard.board;

    @Override
    public Board getBoard(Board parent) {

        return jpaQueryFactory.selectFrom(qBoard).where(qBoard.parent.eq(parent)).fetchOne();
    }

    @Override
    public List<Board> boardList() {
        return jpaQueryFactory.selectFrom(qBoard).fetch();
    }
}
