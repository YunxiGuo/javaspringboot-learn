package com.virgo.springbucks.service;

import com.virgo.springbucks.entity.Coffee;

import java.util.List;

/**
 *
 */
public interface CoffeeService {
    /**
     * 获取咖啡列表
     * @return
     */
    public List<Coffee> getAll();

    public Coffee getCoffeeById(Long id) throws Exception;

    public Coffee getCoffeeByName(String name);

    public Coffee insertCoffee(String name,Double price);

    public void deleteCoffee(Long id);
}
