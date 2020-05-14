package com.jinyuxin.spring051301.dao.impl;

import com.jinyuxin.spring051301.dao.AccountDao;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:21
 */
public class AccountDaoImpl implements AccountDao {

  public AccountDaoImpl() {
    System.out.println("对象已经创建...");
  }

  public void save() {
    System.out.println("dao层保存成功....");
  }
}
