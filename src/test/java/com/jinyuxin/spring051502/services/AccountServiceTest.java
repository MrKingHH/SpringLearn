package com.jinyuxin.spring051502.services;

import com.jinyuxin.spring051502.config.SpringConfiguration;
import com.jinyuxin.spring051502.entity.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Jnit单元测试，测试我们的配置。
 * Spring整合junit配置
 *    1. 导入spring整合junit的maven坐标。spring-test
 *    2. 使用junit提供的一个注解把原有的main方法替换了，替换成spring提供的 @RunWith
 *    3. 告知Spring的运行器，Spring和ioc创建是基于xml还是基于注解的，并说明位置。
 *        ContextConfiguration:
 *            locations:指定xml文件位置，加上classpath关键字，表示在类路径下。
 *            classes:直接注解类所在位置
 * 当我们使用Spring 5.x版本的时候，要求junit版本的jar包必须是4.12及以上。
 *
 * @auther SamuelKing
 * @date 2020/5/15 14:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

  //  ApplicationContext ac;
  @Autowired
  IAccountService as;

//  @Before
//  public void init() {
//    //获取容器
//    ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//    //获取service对象
//    as = ac.getBean("accountService", IAccountService.class);
//  }

  @Test
  public void testQueryAll1() {
    //执行方法
    List<Account> results = as.queryAll();
    for (Account account : results) {
      System.out.println(account);
    }
    System.out.println("-----------------1-----------------");
  }

  @Test
  public void testQueryOne2() {
    //执行方法
    Account account = as.queryOneById(1);
    System.out.println(account);
    System.out.println("-----------------2-----------------");
  }

  @Test
  public void testQuerySave3() {
    //执行方法
    Account account = Account.builder().name("test").money(4567f).build();
    as.saveAccount(account);
    System.out.println("-----------------3-----------------");
  }

  @Test
  public void testUpdate4() {
    //执行方法
    Account account = as.queryOneById(15);
    account.setMoney(23456f);
    as.updateAccount(account);
    System.out.println("-----------------4-----------------");
  }

  @Test
  public void testDelete5() {
    //执行方法
    as.deleteAccount(15);
    System.out.println("-----------------5-----------------");
  }
}
