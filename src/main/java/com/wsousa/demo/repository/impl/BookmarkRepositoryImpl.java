package com.wsousa.demo.repository.impl;

import com.wsousa.demo.config.ApplicationProperties;
import com.wsousa.demo.domain.Bookmark;
import com.wsousa.demo.domain.PagedResult;
import com.wsousa.demo.entity.BookmarkEntity;
import com.wsousa.demo.mapper.BookmarkMapper;
import com.wsousa.demo.repository.BookmarkRepository;
import com.wsousa.demo.repository.JpaBookmarkRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Repository
public class BookmarkRepositoryImpl implements BookmarkRepository {
    private final JpaBookmarkRepository jpaBookmarkRepository;
    private final BookmarkMapper bookmarkMapper;
    private final ApplicationProperties applicationProperties;

    public BookmarkRepositoryImpl(JpaBookmarkRepository repo, BookmarkMapper bookmarkMapper, ApplicationProperties applicationProperties) {
        this.jpaBookmarkRepository = repo;
        this.bookmarkMapper = bookmarkMapper;
        this.applicationProperties = applicationProperties;
    }

    @Override
    public PagedResult<Bookmark> findAll(int pageNo) {
        Pageable pageable = getPageable(pageNo);
        return new PagedResult<>(jpaBookmarkRepository.findAllBookmarks(pageable));
    }

    @Override
    public Optional<Bookmark> findById(Long id) {
        return jpaBookmarkRepository.findBookmarkById(id);
    }

    @Override
    public Bookmark save(Bookmark bookmark) {
        BookmarkEntity entity = bookmarkMapper.toEntity(bookmark);
        return bookmarkMapper.toModel(jpaBookmarkRepository.save(entity));
    }

    @Override
    public Iterable<Bookmark> saveAll(Iterable<Bookmark> bookmarks) {
        List<BookmarkEntity> entities = StreamSupport.stream(bookmarks.spliterator(), false).map(bookmarkMapper::toEntity).toList();
        return jpaBookmarkRepository.saveAll(entities).stream().map(bookmarkMapper::toModel).toList();
    }

    @Override
    public void deleteById(Long id) {
        jpaBookmarkRepository.deleteBookmarkById(id);
    }

    @Override
    public long count() {
        return jpaBookmarkRepository.count();
    }

    private Pageable getPageable(int pageNo) {
        int page = (pageNo > 0) ? pageNo - 1 : 0;
        return PageRequest.of(page, applicationProperties.pageSize(), Sort.by(Sort.Direction.DESC, "createdAt"));
    }
}