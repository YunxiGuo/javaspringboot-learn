package com.virgo.jpaspringbootlearn.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 10:18
 */
@Entity
@Data
@Table(name = "author")
@NoArgsConstructor
public class Author extends BaseEntity {

    @NonNull
    @Size(max = 100,message = "name不能超过100个字符")
    private String name;

    @NonNull
    @Size(max = 200,message = "hometown不能超过200个字符")
    private String hometown;
}
