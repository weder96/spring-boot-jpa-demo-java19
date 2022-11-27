package com.wsousa.demo.config;

import com.wsousa.demo.domain.Bookmark;
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

    private List<Bookmark> getBookmarks() {
        return List.of(
                new Bookmark(null, "Learn to Program", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Really Friendly Command Line Intro", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Novice", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Exercises for Programmers", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Explain the Cloud Like Im 10", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Really Friendly Git Intro", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Apprentice", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Apprenticeship Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Art of Unit Testing", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Grokking Algorithms", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Grokking Simplicity", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Object-Oriented Thought Process", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Pragmatic Thinking and Learning", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Small, Sharp Software Tools", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Journeyman", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Art of Agile Development", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Clean Code", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Dependency Injection", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Head First Design Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Practical SQL Handbook", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Pragmatic Programmer", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Refactoring", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Test-Driven Development", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "C Programming Language", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Clean Architecture", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Continuous Delivery", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Little Schemer", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Programming Pearls", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Refactoring to Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Seven Languages in Seven Weeks", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Working Effectively with Legacy Code", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "XUnit Test Patterns", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Crafting Interpreters", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Designing Data-Intensive Applications", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Domain-Driven Design", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Introduction to Algorithms", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Mythical Man-Month", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Operating Systems", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Patterns of Enterprise Application Architecture", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Structure and Interpretation of Computer Programs", "https://www.programmingbooks.dev/",Instant.now()),
        new Bookmark(null, "Thinking Functionally", "https://www.programmingbooks.dev/",Instant.now())
        );
    }
}