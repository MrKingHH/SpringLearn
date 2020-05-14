package com.jinyuxin.spring051302.factory;

import com.jinyuxin.spring051302.services.AccountService;
import com.jinyuxin.spring051302.services.impl.AccountServiceImpl;

/**
 * @auther SamuelKing
 * @date 2020/5/13 15:20
 * 模拟一个工厂类，该类可能存在与jar包中，无法修改。
 */
public class InstanceFactory {

  public AccountService getInstance() {
    return new AccountServiceImpl();
  }
}
