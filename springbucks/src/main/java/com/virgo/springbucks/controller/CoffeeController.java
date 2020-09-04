package com.virgo.springbucks.controller;

import com.virgo.springbucks.dto.CreateCoffeeInput;
import com.virgo.springbucks.entity.Coffee;
import com.virgo.springbucks.service.CoffeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 14:45
 */
@RestController
@RequestMapping(path = "/coffees")
@Slf4j
@Api(tags = "coffee接口")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;
    @PostMapping
    @ApiOperation(value = "创建coffee")
    public Coffee createCoffee(@RequestBody CreateCoffeeInput coffee){
        Coffee result = coffeeService.insertCoffee(coffee.getName(),coffee.getPrice());
        return result;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取coffee")
    public Coffee getCoffeeById(@PathVariable Long id) throws Exception{
        Coffee coffee = coffeeService.getCoffeeById(id);
        log.info("Coffee {}",coffee);
        return coffee;
    }

//    @GetMapping(path = "/test/{id}")
//    @ApiOperation(value = "测试接口")
//    public Coffee getTest(@PathVariable Long id){
//        Coffee coffee = new Coffee();
//        coffee.setName("雀巢");
//        coffee.setPrice(Money.of(CurrencyUnit.of("CNY"),11.9));
//        return coffee;
//    }
}
