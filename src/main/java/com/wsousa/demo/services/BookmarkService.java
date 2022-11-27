package com.wsousa.demo.services;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.response.PagedResult;

import java.util.Optional;

public interface BookmarkService {

    public PagedResult<BookmarkDTO> getBookmarks(int pageNo);
    public Optional<BookmarkDTO> getBookmarkById(Long id);
    public BookmarkDTO save(BookmarkDTO bookmarkDTO);
    public void deleteById(Long id);
}
