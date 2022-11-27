package com.wsousa.demo.config;

import com.wsousa.demo.dto.BookmarkDTO;
import com.wsousa.demo.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repo;

    @Override
    public void run(String... args) {
        long count = repo.count();
        if(count > 0) {
            log.info("Data already exists. Skipping data initialization");
            return;
        }
        repo.saveAll(getBookmarks());
    }

    private List<BookmarkDTO> getBookmarks() {
        return List.of(
                new BookmarkDTO(null, "Learn to Program", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Really Friendly Command Line Intro", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Novice", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Exercises for Programmers", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Explain the Cloud Like Im 10", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Really Friendly Git Intro", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Apprentice", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Apprenticeship Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Art of Unit Testing", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Grokking Algorithms", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Grokking Simplicity", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Object-Oriented Thought Process", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Pragmatic Thinking and Learning", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Small, Sharp Software Tools", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Journeyman", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Art of Agile Development", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Clean Code", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Dependency Injection", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Head First Design Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Practical SQL Handbook", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Pragmatic Programmer", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Refactoring", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Test-Driven Development", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "C Programming Language", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Clean Architecture", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Continuous Delivery", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Little Schemer", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Programming Pearls", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Refactoring to Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Seven Languages in Seven Weeks", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Working Effectively with Legacy Code", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "XUnit Test Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Crafting Interpreters", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Designing Data-Intensive Applications", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Domain-Driven Design", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Introduction to Algorithms", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Mythical Man-Month", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Operating Systems", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Patterns of Enterprise Application Architecture", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Structure and Interpretation of Computer Programs", "https://www.programmingbooks.dev/",Instant.now()),
        new BookmarkDTO(null, "Thinking Functionally", "https://www.programmingbooks.dev/",Instant.now())
        );
    }
}