package com.jinyuxin.spring051302;

import com.jinyuxin.spring051302.services.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther SamuelKing
 * @date 2020/5/13 15:19
 */
public class Main {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext01.xml");
//    AccountService as1 = ac.getBean("accountService01", AccountService.class);
//    AccountService as2 = ac.getBean("accountService02", AccountService.class);
//    as1.save();
//    as2.save();
    AccountService as3 = ac.getBean("accountService", AccountService.class);
    AccountService as4 = ac.getBean("accountService", AccountService.class);
    System.out.println(as3 == as4);//true

  }
}
