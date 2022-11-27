package com.wsousa.demo.mapper;

import com.wsousa.demo.domain.Bookmark;
import com.wsousa.demo.entity.BookmarkEntity;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkEntity toEntity(Bookmark bookmark) {
        BookmarkEntity entity = new BookmarkEntity();
        entity.setId(bookmark.id());
        entity.setTitle(bookmark.title());
        entity.setUrl(bookmark.url());
        entity.setCreatedAt(bookmark.createdAt());
        return entity;
    }

    public Bookmark toModel(BookmarkEntity entity) {
        return new Bookmark(entity.getId(),entity.getTitle(),entity.getUrl(),entity.getCreatedAt());
    }
}
