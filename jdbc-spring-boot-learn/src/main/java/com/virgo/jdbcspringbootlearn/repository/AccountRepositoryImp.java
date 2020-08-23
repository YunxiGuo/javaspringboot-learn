package com.virgo.jdbcspringbootlearn.repository;

import com.virgo.jdbcspringbootlearn.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/5 9:31
 */
@Repository
public class AccountRepositoryImp implements AccountRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account findAccount(Long id) {
        var sql = "select * from Account where id=?";
        var result = jdbcTemplate.queryForObject(sql, this::mapRowToAccount,id);
        return result;
    }

    private Account mapRowToAccount(ResultSet rs,int rowNum) throws SQLException {
        return new Account(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getInt("age"));
    }

    @Override
    public Integer insert(Account account) {
        var result = jdbcTemplate.update("insert into Account(id,name,age) values ( ?,?,? )", account.getId(), account.getName(), account.getAge());
        return result;
    }

    @Override
    public void deleteAccount(Long id) {

    }

    @Override
    public Integer updateAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> findAccounts() {
        return null;
    }
}
