package com.jinyuxin.spring051402.services;

import com.jinyuxin.spring051402.entity.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试，测试我们的配置
 *
 * @auther SamuelKing
 * @date 2020/5/15 10:09
 */
public class AccountServiceTest {

  @Test
  public void testQueryAll1() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext03.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    List<Account> results = as.queryAll();
    for (Account account : results) {
      System.out.println(account);
    }
    System.out.println("-----------------1-----------------");
  }

  @Test
  public void testQueryOne2() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext03.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    Account account = as.queryOneById(1);
    System.out.println(account);
    System.out.println("-----------------2-----------------");
  }

  @Test
  public void testQuerySave3() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext03.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    Account account = Account.builder().name("test").money(4567f).build();
    as.saveAccount(account);
    System.out.println("-----------------3-----------------");
  }

  @Test
  public void testUpdate4() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext03.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    Account account = as.queryOneById(13);
    account.setMoney(23456f);
    as.updateAccount(account);
    System.out.println("-----------------4-----------------");
  }

  @Test
  public void testDelete5() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext03.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    as.deleteAccount(13);
    System.out.println("-----------------5-----------------");
  }
}
