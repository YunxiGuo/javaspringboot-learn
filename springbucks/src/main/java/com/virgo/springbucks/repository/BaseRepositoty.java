package com.virgo.springbucks.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 14:29
 */
@NoRepositoryBean  //标识这不是一个bean
public interface BaseRepositoty<T,Long> extends PagingAndSortingRepository {
}
