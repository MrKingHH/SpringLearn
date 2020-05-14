package com.jinyuxin.spring051302.factory;

import com.jinyuxin.spring051302.services.AccountService;
import com.jinyuxin.spring051302.services.impl.AccountServiceImpl;

/**
 * @auther SamuelKing
 * @date 2020/5/13 15:20
 */
public class StaticFactory {

  public static AccountService getInstance() {
    return new AccountServiceImpl();
  }
}
