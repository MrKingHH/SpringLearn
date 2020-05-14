package com.jinyuxin.spring051401;

import com.jinyuxin.spring051401.config.SpringConfigutation;
import com.jinyuxin.spring051401.services.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther SamuelKing
 * @date 2020/5/13 15:19
 */
public class Main {
  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigutation.class);
    AccountService as = ac.getBean("accountService", AccountService.class);
    as.save();

  }
}
