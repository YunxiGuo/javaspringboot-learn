package com.virgo.jdbcspringbootlearn.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author GUOYUNXI
 * @date 2020/8/5 9:22
 */
@Data
public class Account {
    public Long id;
    public String name;
    public Integer age;

    public Account(){}

    public Account(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Account(Long id,String name,Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
