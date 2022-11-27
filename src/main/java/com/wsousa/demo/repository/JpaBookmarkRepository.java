package com.wsousa.demo.repository;
;
import com.wsousa.demo.dto.BookmarkDTO;
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
    @Query("select new com.wsousa.demo.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) from BookmarkEntity b")
    Page<BookmarkDTO> findAllBookmarks(Pageable pageable);

    @Query("select new com.wsousa.demo.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) from BookmarkEntity b where b.id = ?1")
    Optional<BookmarkDTO> findBookmarkById(Long id);

    @Query("delete from BookmarkEntity  b where b.id=?1")
    @Modifying
    void deleteBookmarkById(Long id);
}