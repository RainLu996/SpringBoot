package com.lujun61.test;

import com.lujun61.config.ImportResourceConfig;
import com.lujun61.config.PropertiesConfig;
import com.lujun61.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    @Test
    public void test1() {
        //没有 xml 配置文件，使用 java 类代替 xml 配置文件 的作用
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println(ac.getBean("createStudent"));
    }

    @Test
    public void test2() {
        //没有 xml 配置文件，使用 java 类代替 xml 配置文件 的作用
        ApplicationContext ac = new AnnotationConfigApplicationContext(ImportResourceConfig.class);

        System.out.println(ac.getBean("myStudent"));
    }

    @Test
    public void test3() {
        //没有 xml 配置文件，使用 java 类代替 xml 配置文件 的作用
        ApplicationContext ac = new AnnotationConfigApplicationContext(PropertiesConfig.class);

        System.out.println(ac.getBean("tiger"));
    }
}
