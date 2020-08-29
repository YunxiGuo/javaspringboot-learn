package com.virgo.springbucks.service;

import com.virgo.springbucks.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public interface CoffeeService {
    /**
     * 获取咖啡列表
     * @return
     */
    public List<Coffee> getAll();

    public Coffee getCoffeeById(Long id);

    public Coffee getCoffeeByName(String name);

    public Coffee insertCoffee(String name);

    public boolean deleteCoffee(Long id);
}
