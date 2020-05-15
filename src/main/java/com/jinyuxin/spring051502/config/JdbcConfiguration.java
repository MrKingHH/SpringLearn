package com.jinyuxin.spring051502.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 *
 * 和Spring连接数据库相关的配置类.
 * 构造函数传入
 * new AnnotationConfigApplicationContext(SpringConfiguration.class, JdbcConfiguration.class)
 * 和 注解 @Configuration 二选一。才能被Spring容器当成一个配置类。
 * @auther SamuelKing
 * @date 2020/5/15 15:49
 */
public class JdbcConfiguration {

  @Value("${jdbc.driver}")
  private String driver;

  @Value("${jdbc.url}")
  private String url;

  @Value("${jdbc.user}")
  private String user;

  @Value("${jdbc.password}")
  private int password;

  /**
   * 用于创建一个QueryRunner。不加 @Bean 注解的话，只会创建对象，不会放到Spring容器中。
   * 不加scope注解就是默认的单例对象。
   * @param dataSource
   * @return
   */
  @Bean("runner")
  @Scope("prototype")
  public QueryRunner createQueryRunner(DataSource dataSource) {
    return new QueryRunner(dataSource);
  }

  /**
   * 创建数据源对象。
   * @return
   */
  @Bean(name = "datasource")
  public DataSource createDataSource(){
    ComboPooledDataSource ds = new ComboPooledDataSource();
    try {
      ds.setDriverClass(driver);
      ds.setJdbcUrl(url);
      ds.setUser(user);
      ds.setPassword(String.valueOf(password));
      return ds;
    } catch (PropertyVetoException e) {
      throw new RuntimeException(e);
    }

  }
}
