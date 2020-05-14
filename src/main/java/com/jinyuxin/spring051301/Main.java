package com.jinyuxin.spring051301;

import com.jinyuxin.spring051301.dao.AccountDao;
import com.jinyuxin.spring051301.services.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @auther SamuelKing
 * @date 2020/5/13 14:19
 */
public class Main {
  public static void main(String[] args) {
    //ApplicationContext是加载文件时就创建对象
    //适合单例对象
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext01.xml");
    AccountService as = ac.getBean("accountService", AccountService.class);
    System.out.println(as);
    as.save();

    //BeanFactory是延时创建对象，什么时候用到就创建对象
    //适合多例对象
    Resource resource = new ClassPathResource("applicationContext01.xml");
    BeanFactory bf = new XmlBeanFactory(resource);
    AccountDao ad = bf.getBean("accountDao", AccountDao.class);
    ad.save();
  }
}

