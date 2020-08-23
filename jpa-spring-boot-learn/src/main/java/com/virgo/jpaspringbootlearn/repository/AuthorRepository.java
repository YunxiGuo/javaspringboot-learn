package com.virgo.jpaspringbootlearn.repository;

import com.virgo.jpaspringbootlearn.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 15:18
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
