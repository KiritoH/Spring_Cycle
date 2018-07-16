package com.yww.ioc.demo3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围的测试
 */
public class SpringDemo3 {
    @Test
    public void demo1(){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");

        System.out.println(person1);
        System.out.println(person2);
    }


    @Test
    public void demo2(){
        //ApplicationContext没有销毁方法,无法进行销毁
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //可以用ClassPathXmlApplicationContext的实现类来实例
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man) applicationContext.getBean("man");
        man.run();
        applicationContext.close();

    }


    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.findAll();
        userDao.save();
        userDao.delete();
        userDao.update();

    }
}
