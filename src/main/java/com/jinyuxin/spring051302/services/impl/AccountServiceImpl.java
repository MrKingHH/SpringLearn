package com.jinyuxin.spring051302.services.impl;

import com.jinyuxin.spring051302.services.AccountService;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:22
 */
public class AccountServiceImpl implements AccountService {

  public AccountServiceImpl() {
    System.out.println("对象创建了...");
  }

  public void save() {
    System.out.println("service调用dao层保存服务...");
  }

  public void init() {
    System.out.println("对象初始化了...");
  }

  public void destroy() {
    System.out.println("对象销毁了...");
  }
}
