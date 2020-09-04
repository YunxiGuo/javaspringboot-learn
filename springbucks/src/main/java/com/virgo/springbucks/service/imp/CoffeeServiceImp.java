package com.virgo.springbucks.service.imp;

import com.virgo.springbucks.entity.Coffee;
import com.virgo.springbucks.repository.CoffeeRepository;
import com.virgo.springbucks.service.CoffeeService;
import org.hibernate.criterion.NullExpression;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 14:38
 */
@Service
@Transactional
public class CoffeeServiceImp implements CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    @Override
    public List<Coffee> getAll() {
        List<Coffee> coffees = (List<Coffee>) coffeeRepository.findAll();
        return coffees;
    }

    @Override
    public Coffee getCoffeeById(Long id) throws Exception {
        Coffee coffee = coffeeRepository.findById(id).orElseThrow(() -> new Exception("coffee 不存在"));
        return coffee;
    }

    @Override
    public Coffee getCoffeeByName(String name) {
        return null;
    }

    @Override
    public Coffee insertCoffee(String name,Double price) {
        Coffee coffee = new Coffee();
        coffee.setName(name);
        coffee.setPrice(Money.of(CurrencyUnit.of("CNY"),price));
        return coffeeRepository.save(coffee);
    }

    @Override
    public boolean deleteCoffee(Long id) {
        return false;
    }
}
