package com.virgo.jdbcspringbootlearn.repository;

import com.virgo.jdbcspringbootlearn.entities.Account;

import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/5 9:24
 */
public interface AccountRepository {
    public Account findAccount(Long id);
    public Integer insert(Account account);
    public void deleteAccount(Long id);
    public Integer updateAccount(Account account);
    public List<Account> findAccounts();
}
