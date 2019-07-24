package com.itheima.dao;
/**
 * 账户的持久层接口
 */
import com.itheima.domain.Account;

import java.util.List;

public interface IAccountDao {

    void save(Account account);

    void update(Account account);

    void delete(Integer accountId);

    Account findById(Integer accountId);

    List<Account> findAll();
}
