package com.lujun61.config;

import com.lujun61.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解：表示当前类是作为Spring配置文件来使用
 *    在这个类中有很多方法，每个方法的返回值都是对象。
 *    在方法的上面加入@Bean注解，表示将方法返回值中的对象放入到Spring容器中。
 */
@Configuration
public class SpringConfig {
    /**
     * 定义方法， 方法的返回值是对象。
     * @Bean：表示把对象注入到容器中。
     * 位置： 方法的上面
     * @Bean 没有使用属性，默认对象名称是方法名
     */
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setId(1002);
        student.setName("lujun");
        student.setAge(29);
        return student;
    }

    // name ：指定对象的名称
    @Bean(name = "myStudent2")
    public Student makeStudent(){
        Student student = new Student();
        student.setId(1003);
        student.setName("xiaolu");
        student.setAge(30);
        return student;
    }
}
