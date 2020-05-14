package com.jinyuxin.spring051303.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther SamuelKing
 * @date 2020/5/13 15:19
 */
public class Main {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext02.xml");
    AccountService as = ac.getBean("accountService", AccountService.class);
    as.save();

  }
}
