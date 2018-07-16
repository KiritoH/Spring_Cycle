package com.yww.ioc.demo1;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemo1 {

    @Test
    /**
     * 传统方式
     */
    public void demo1(){

        //传统方式要new出对象，具有一定的耦合关系，故可用spring-ioc来解耦合
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    public void demo2(){
        //创建spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得工厂获得类,使用Bean<使用bean的id>
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();

    }

    @Test
    /**
     * 读取磁盘系统中的配置文件
     */
    public void demo3(){

        //创建Spring的工厂类
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("d:\\applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();

    }

    @Test
    /**
     * 传统方式的工厂类
     */
    public void demo4(){
        //创建工厂类:
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();

    }

}
