package com.virgo.jpaspringbootlearn.controller;

import com.virgo.jpaspringbootlearn.entities.Author;
import com.virgo.jpaspringbootlearn.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 15:30
 */
@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    /**
     *
     * @return
     */
    @PostMapping("/")
    public Author createAuthor(@RequestBody Author input){
        Author author = authorService.createAuthor(input.getId(),input.getName(),input.getHometown());
        return author;
    }
}
