package com.jinyuxin.spring051401.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 该类是一个配置类，它的作用和applicationCnotext.xml的作用是一样的。
 * Spring新注解：
 *     Configuration:
 *        作用：指定当前类是一个配置类。
 *    ComponentScan:
 *        作用：用于通过注解指定spring在创建容器时要扫描的包。
 *        属性：
 *            value:它和basePackages作用是一样的，都是用于指定容器创建时需要扫描的包。
 *                  我们使用它等同于就是在xml中配置了：
 *                   <context:component-scan base-package="com.jinyuxin.spring051401"></context:component-scan>
 *
 * @auther SamuelKing
 * @date 2020/5/14 10:34
 */
@Configuration
@ComponentScan(basePackages = {"com.jinyuxin.spring051401"})
public class SpringConfigutation {
}
