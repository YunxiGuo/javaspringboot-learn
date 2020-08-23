package com.virgo.jpaspringbootlearn.repository;

import com.virgo.jpaspringbootlearn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GUOYUNXI
 * @date 2020/8/21 11:54
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
