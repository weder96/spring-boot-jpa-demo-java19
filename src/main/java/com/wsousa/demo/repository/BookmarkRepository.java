package com.wsousa.demo.repository;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.response.PagedResponse;

import java.util.Optional;

public interface BookmarkRepository {
    PagedResponse<BookmarkDTO> findAll(int pageNo);
    Optional<BookmarkDTO> findById(Long id);
    BookmarkDTO save(BookmarkDTO bookmarkDTO);
    Iterable<BookmarkDTO> saveAll(Iterable<BookmarkDTO> bookmarks);
    void deleteById(Long id);
    long count();
}