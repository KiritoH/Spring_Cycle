package com.yww.ioc.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试实例化对象
 */
public class SpringDemo2 {

    @Test
    public void demo1(){
        //创建工厂,读取类目录下的xml文件
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");

    }

    @Test
    public void demo2(){
        //创建工厂,读取类目录下的xml文件(只要创建改工厂,就会实例化该工厂配置文件下的所有类)
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");

    }
    @Test
    public void demo3(){
        //创建工厂,读取类目录下的xml文件(只要创建改工厂,就会实例化该工厂配置文件下的所有类)
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");

    }

}
