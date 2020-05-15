package com.jinyuxin.spring051502;

import com.jinyuxin.spring051502.config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther SamuelKing
 * @date 2020/5/15 14:31
 */
public class QueryRunnerTest {
  @Test
  public void testQueryRunner() {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    QueryRunner qr1 = ac.getBean("runner", QueryRunner.class);
    QueryRunner qr2 = ac.getBean("runner", QueryRunner.class);
    System.out.println(qr1 == qr2);
  }
}
