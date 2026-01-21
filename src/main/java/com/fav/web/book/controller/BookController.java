package com.fav.web.book.controller;

import com.fav.web.book.entity.Book;
import com.fav.web.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @GetMapping("/list")
    public List<Book> list() {
        return bookService.list();
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book) {
        return bookService.createNewBook(book);
    }
}
