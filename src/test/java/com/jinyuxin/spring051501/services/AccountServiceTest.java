package com.jinyuxin.spring051501.services;

import com.jinyuxin.spring051501.entity.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther SamuelKing
 * @date 2020/5/15 14:31
 */
public class AccountServiceTest {

  @Test
  public void testQueryAll1() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext04.xml");
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
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext04.xml");
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
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext04.xml");
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
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext04.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    Account account = as.queryOneById(15);
    account.setMoney(23456f);
    as.updateAccount(account);
    System.out.println("-----------------4-----------------");
  }

  @Test
  public void testDelete5() {
    //获取容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext04.xml");
    //获取service对象
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    //执行方法
    as.deleteAccount(15);
    System.out.println("-----------------5-----------------");
  }
}
