package com.jinyuxin.spring051501.dao.impl;

import com.jinyuxin.spring051501.dao.IAccountDao;
import com.jinyuxin.spring051501.entity.Account;
import lombok.NoArgsConstructor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * 账户 数据访问层/持久层 实现类
 *
 * @auther SamuelKing
 * @date 2020/5/13 14:21
 */
@NoArgsConstructor
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

  @Autowired
  private QueryRunner runner;

  public List<Account> queryAll() {
    try {
      return runner.query("select * from account;", new BeanListHandler<Account>(Account.class));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public Account queryOneById(Integer id) {
    try {
      return runner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class), id);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void saveAccount(Account account) {
    try {
      runner.update("insert into account(name, money) values(?,?)", account.getName(), account.getMoney());
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void updateAccount(Account account) {
    try {
      runner.update("update account set name=?, money=? where id=?", account.getName(), account.getMoney(), account.getId());
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void deleteAccount(Integer id) {
    try {
      runner.update("delete from account where id=?", id);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
