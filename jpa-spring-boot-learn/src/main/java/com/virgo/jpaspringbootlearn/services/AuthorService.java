package com.virgo.jpaspringbootlearn.services;

import com.virgo.jpaspringbootlearn.entities.Author;
import com.virgo.jpaspringbootlearn.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 15:31
 */
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    /**
     * 创建作者信息
     * @param name:作者姓名
     * @param hometown:作者出生地
     * @return 保存的作者信息
     */
    public Author createAuthor(Long id, String name, String hometown){

        if (StringUtils.isEmpty(name)){
            return null;
        }
        Author author = new Author();
//        author.setId(id);
        author.setName(name);
        author.setHometown(hometown);
        return authorRepository.save(author);
    }
}
