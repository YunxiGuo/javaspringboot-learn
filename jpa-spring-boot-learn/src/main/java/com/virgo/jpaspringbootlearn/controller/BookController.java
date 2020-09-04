package com.virgo.jpaspringbootlearn.controller;

import com.virgo.jpaspringbootlearn.entities.Book;
import com.virgo.jpaspringbootlearn.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author GUOYUNXI
 * @date 2020/8/21 11:56
 */
@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        var book = bookRepository.getOne(id);
        return book;
    }
}
