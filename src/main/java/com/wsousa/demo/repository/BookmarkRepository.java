package com.wsousa.demo.repository;

import com.wsousa.demo.domain.Bookmark;
import com.wsousa.demo.domain.PagedResult;

import java.util.Optional;

public interface BookmarkRepository {
    PagedResult<Bookmark> findAll(int pageNo);
    Optional<Bookmark> findById(Long id);
    Bookmark save(Bookmark bookmark);
    Iterable<Bookmark> saveAll(Iterable<Bookmark> bookmarks);
    void deleteById(Long id);
    long count();
}