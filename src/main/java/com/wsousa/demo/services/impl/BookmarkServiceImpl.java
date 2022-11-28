package com.wsousa.demo.services.impl;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.repository.BookmarkRepository;
import com.wsousa.demo.response.PagedResponse;
import com.wsousa.demo.services.BookmarkService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class BookmarkServiceImpl implements BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    public PagedResponse<BookmarkDTO> getBookmarks(int pageNo) {
        return bookmarkRepository.findAll(pageNo);
    }

    public Optional<BookmarkDTO> getBookmarkById(Long id) {
        return bookmarkRepository.findById(id);
    }

    public BookmarkDTO save(BookmarkDTO bookmarkDTO) {
        return bookmarkRepository.save(bookmarkDTO);
    }

    public void deleteById(Long id) {
        bookmarkRepository.deleteById(id);
    }
}
