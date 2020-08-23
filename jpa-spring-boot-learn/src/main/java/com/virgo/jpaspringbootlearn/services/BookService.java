package com.virgo.jpaspringbootlearn.services;

import com.virgo.jpaspringbootlearn.entities.Author;
import com.virgo.jpaspringbootlearn.repository.AuthorRepository;
import com.virgo.jpaspringbootlearn.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 15:16
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;


}
