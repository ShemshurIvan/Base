package com.fav.web.book.controller;

import com.fav.web.book.entity.Book;
import com.fav.web.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/list")
    public List<Book> list() {
        return bookService.list();
    }
}
