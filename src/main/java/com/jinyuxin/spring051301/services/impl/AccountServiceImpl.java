package com.jinyuxin.spring051301.services.impl;

import com.jinyuxin.spring051301.dao.AccountDao;
import com.jinyuxin.spring051301.dao.impl.AccountDaoImpl;
import com.jinyuxin.spring051301.services.AccountService;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:22
 */
public class AccountServiceImpl implements AccountService {

  private AccountDao ac = null;

  public void setAc(AccountDaoImpl ac) {
    this.ac = ac;
  }

  public void save() {
    System.out.println("service调用dao层保存服务...");
    ac.save();
  }

  public void init() {
    System.out.println("service被初始化了....");
  }

  public void destroy() {
    System.out.println("service被销毁了....");
  }

}
