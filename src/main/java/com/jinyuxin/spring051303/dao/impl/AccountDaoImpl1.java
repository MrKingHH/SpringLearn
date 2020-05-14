package com.jinyuxin.spring051303.dao.impl;

import com.jinyuxin.spring051303.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:21
 */
@Repository("accountDao1")
public class AccountDaoImpl1 implements AccountDao {

  public AccountDaoImpl1() {
  }

  public void save() {
    System.out.println("dao1层保存成功....");
  }
}
