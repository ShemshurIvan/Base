package com.fav.web.book.service;

import com.fav.web.book.entity.Book;
import com.fav.web.book.repository.BookDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Year;
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

    @Transactional
    public Book createNewBook(Book book){
        if(book.getPublicationYear() > Year.now().getValue()){
            throw new IllegalArgumentException("Can not be in the future");
        }
        book.setPublicationYear(Year.now().getValue());
        return bookDAO.save(book);
    }
}
