package com.lujun61;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 在 Application 主类上，@EnableTransactionManagement 表示开启事务支持（SpringBoot默认已经开启了）
 *
 * 对于@EnableTransactionManagement 是可选的，但是Service方法必须要添加【@Transactional】才会让事务生效
 */
//@EnableTransactionManagement


/** 有多个dao接口时，在每个接口上面加上@Mapper注解是不方便的；为了简化操作，可以在主类之上加上@MapperScan注解
 *
 * @MapperScan： 扫描所有的 mybatis 的 dao 接口
 * 位置：在主类的上面
 * 属性：basePackages（字符串数组）：指定 dao 接口的所在的包名（可以有多个）。
 * 如果dao 接口和 mapper 文件在【同一目录】，直接这样配置就行；如果不在同一目录，就需要在【配置文件】中配置mapper文件所在的位置
 */
//@MapperScan(basePackages = {"com.lujun61.dao1", "com.lujun61.dao2", "com.lujun61.dao3"})


/**
 * ComponentScan注解默认扫描包的规则是： @ComponentScan所在的类所在的包和子包。
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        /**
         * 虽然没有自定义配置文件，但是仍然可以获取容器对象
         */
        ApplicationContext ac = SpringApplication.run(Application.class, args);

        System.out.println(ac.getBean("info"));
    }


    /**
     * 在容器启动后执行一些内容
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("在容器对象创建好后执行的代码");
    }
}
