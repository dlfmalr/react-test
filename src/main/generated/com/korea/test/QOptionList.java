package com.korea.test;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOptionList is a Querydsl query type for OptionList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOptionList extends EntityPathBase<OptionList> {

    private static final long serialVersionUID = 346603454L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOptionList optionList = new QOptionList("optionList");

    public final QBoard board;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QOptionList(String variable) {
        this(OptionList.class, forVariable(variable), INITS);
    }

    public QOptionList(Path<? extends OptionList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOptionList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOptionList(PathMetadata metadata, PathInits inits) {
        this(OptionList.class, metadata, inits);
    }

    public QOptionList(Class<? extends OptionList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
    }

}

