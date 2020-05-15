package com.jinyuxin.spring051502.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 该类是一个配置类，和applicationContext.xml文件作用一样。
 * Spring新注解：
 *  *     Configuration:
 *  *        作用：指定当前类是一个配置类。
 *           细节：当配置类作为AnnotationConfigApplicationContext创建对象时的参数时，该注解可以不写。
 *  *    ComponentScan:
 *  *        作用：用于通过注解指定spring在创建容器时要扫描的包。扫描使用了注解的地方。
 *  *        属性：
 *  *            value:它和basePackages作用是一样的，都是用于指定容器创建时需要扫描的包。
 *  *                  我们使用它等同于就是在xml中配置了：
 *  *                   <context:component-scan base-package="com.jinyuxin.spring051401"></context:component-scan>
 *      Bean：
 *          作用：用于把当前方法的返回值作为bean对象注入到spring的ioc容器中。Spring容器key-value类型的，必然有一个bean id。
 *          属性：
 *              name:用于指定bean的id。当不写时，默认是当前方法的名称。
 *          细节：
 *              当我们使用Bean注解配置方法返回值时，如果方法有参数，那么spring框架会去容器中查找看看有没有可用的Bean对象。
 *              查找的方式和Autowired注解的作用是一样的，如果有唯一的类型匹配就注入，如果没有匹配时，就保错，如果有多个匹配时，就可以使用
 *              @Qualify 注解在方法列表中指明使用哪个Bean对象。
 *      Import:
 *          作用：导入其他的配置类。
 *          属性：
 *              value:用于指定其它配置类的字节码。
 *          细节：使用了该注解，就不用在子配置文件中加Configuration注解了。
 *      PropertySource:
 *          作用：用于指定properties文件的位置。
 *          属性：
 *              value:指定文件的名称和路径。
 *                  关键字：classpath，表示类路径下。
 *
 * @auther SamuelKing
 * @date 2020/5/15 14:41
 */
//@Configuration
@ComponentScan(basePackages = "com.jinyuxin.spring051502")
@Import(JdbcConfiguration.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

}
