package com.virgo.springbucks.service.imp;

import com.virgo.springbucks.entity.Coffee;
import com.virgo.springbucks.repository.CoffeeRepository;
import com.virgo.springbucks.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 14:38
 */
public class CoffeeServiceImp implements CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    @Override
    public List<Coffee> getAll() {
        List<Coffee> coffees = (List<Coffee>) coffeeRepository.findAll();
        return coffees;
    }

    @Override
    public Coffee getCoffeeById(Long id) {
        return null;
    }

    @Override
    public Coffee getCoffeeByName(String name) {
        return null;
    }

    @Override
    public Coffee insertCoffee(String name) {
        return null;
    }

    @Override
    public boolean deleteCoffee(Long id) {
        return false;
    }
}
