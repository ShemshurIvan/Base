package com.fav.web.book.service;

import com.fav.web.book.entity.Book;
import com.fav.web.book.repository.BookDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookService {

    private final BookDAO bookDAO;

    @GetMapping("/list")
    public List<Book> list(){
        return bookDAO.findAll();
    }
}
