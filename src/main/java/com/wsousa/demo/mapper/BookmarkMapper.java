package com.wsousa.demo.mapper;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.entity.BookmarkEntity;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkEntity toEntity(BookmarkDTO bookmarkDTO) {
        BookmarkEntity entity = new BookmarkEntity();
        entity.setId(bookmarkDTO.id());
        entity.setTitle(bookmarkDTO.title());
        entity.setUrl(bookmarkDTO.url());
        entity.setCreatedAt(bookmarkDTO.createdAt());
        return entity;
    }

    public BookmarkDTO toModel(BookmarkEntity entity) {
        return new BookmarkDTO(entity.getId(),entity.getTitle(),entity.getUrl(),entity.getCreatedAt());
    }
}
