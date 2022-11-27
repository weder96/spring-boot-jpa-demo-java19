package com.wsousa.demo.services;

import com.wsousa.demo.domain.Bookmark;
import com.wsousa.demo.domain.PagedResult;

import java.util.Optional;

public interface BookmarkService {

    public PagedResult<Bookmark> getBookmarks(int pageNo);
    public Optional<Bookmark> getBookmarkById(Long id);
    public Bookmark save(Bookmark bookmark);
    public void deleteById(Long id);
}
