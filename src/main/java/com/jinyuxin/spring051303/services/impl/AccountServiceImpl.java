package com.jinyuxin.spring051303.services.impl;

import com.jinyuxin.spring051303.dao.AccountDao;
import com.jinyuxin.spring051303.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:22
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

  //  @Autowired
//  @Qualifier("accountDao2")
  @Resource(name = "accountDao1")
  private AccountDao accountDao;

  public AccountServiceImpl() {
    System.out.println("service被创建了....");
  }

  public void save() {
    System.out.println("service调用dao层保存服务...");
    accountDao.save();
  }

  @PostConstruct
  public void init() {
    System.out.println("service初始化了....");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("service被销毁了....");
  }

}
