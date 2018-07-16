package com.yww.ioc.demo2;

/**
 * Bean2的静态工厂(指的就是在工厂类中提供了静态的方法返回Bean2的实例化对喜感)
 */
public class Bean2Factory {

    //静态方法无需创建对象
    public static Bean2 createBean2(){
        System.out.println("bean2方法已经执行");
        return new Bean2();
    }
}
