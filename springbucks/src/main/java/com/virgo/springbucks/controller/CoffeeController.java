package com.virgo.springbucks.controller;

import com.virgo.springbucks.entity.Coffee;
import com.virgo.springbucks.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 14:45
 */
@RestController
@RequestMapping(path = "/coffees")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;
    @PostMapping
    public Coffee createCoffee(@RequestBody Coffee coffee){
        Coffee result = coffeeService.insertCoffee(coffee.getName());
        return result;
    }

    @GetMapping(path = "/{id}")
    public Coffee getCoffeeById(@PathVariable Long id){
        Coffee coffee = coffeeService.getCoffeeById(id);
        return coffee;
    }
}
