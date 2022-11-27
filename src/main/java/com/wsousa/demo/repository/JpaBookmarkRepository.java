package com.wsousa.demo.repository;
;
import com.wsousa.demo.domain.Bookmark;
import com.wsousa.demo.entity.BookmarkEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaBookmarkRepository extends JpaRepository<BookmarkEntity, Long> {
    @Query("select new com.wsousa.demo.domain.Bookmark(b.id, b.title, b.url, b.createdAt) from BookmarkEntity b")
    Page<Bookmark> findAllBookmarks(Pageable pageable);

    @Query("select new com.wsousa.demo.domain.Bookmark(b.id, b.title, b.url, b.createdAt) from BookmarkEntity b where b.id = ?1")
    Optional<Bookmark> findBookmarkById(Long id);

    @Query("delete from BookmarkEntity  b where b.id=?1")
    @Modifying
    void deleteBookmarkById(Long id);
}