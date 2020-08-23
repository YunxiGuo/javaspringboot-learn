package com.virgo.jpaspringbootlearn.entities;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author GUOYUNXI
 * @date 2020/8/21 9:33
 */

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
public class Book extends BaseEntity {

    @NonNull
    private String type;

    @NonNull
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    private Author author;
}
