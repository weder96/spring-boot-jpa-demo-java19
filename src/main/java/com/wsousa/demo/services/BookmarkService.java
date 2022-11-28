package com.wsousa.demo.services;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.response.PagedResponse;

import java.util.Optional;

public interface BookmarkService {

    public PagedResponse<BookmarkDTO> getBookmarks(int pageNo);
    public Optional<BookmarkDTO> getBookmarkById(Long id);
    public BookmarkDTO save(BookmarkDTO bookmarkDTO);
    public void deleteById(Long id);
}
