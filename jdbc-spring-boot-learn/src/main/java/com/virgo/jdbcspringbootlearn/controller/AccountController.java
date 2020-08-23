package com.virgo.jdbcspringbootlearn.controller;

import com.virgo.jdbcspringbootlearn.entities.Account;
import com.virgo.jdbcspringbootlearn.repository.AccountRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author GUOYUNXI
 * @date 2020/8/5 9:41
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepositoryImp accountRepositoryImp;

    /**
     * 查找单个用户
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id){
        Account result = accountRepositoryImp.findAccount(id);
        return result;
    }

    /**
     * 创建用户
     * @param account
     */
    @PostMapping("")
    public void creatAccount(@RequestBody Account account){
        accountRepositoryImp.insert(account);
    }
}
