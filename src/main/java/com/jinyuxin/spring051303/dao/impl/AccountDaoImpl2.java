package com.jinyuxin.spring051303.dao.impl;

import com.jinyuxin.spring051303.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @auther SamuelKing
 * @date 2020/5/14 9:30
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {
  public AccountDaoImpl2() {
  }

  public void save() {
    System.out.println("dao2层保存成功....");
  }
}
