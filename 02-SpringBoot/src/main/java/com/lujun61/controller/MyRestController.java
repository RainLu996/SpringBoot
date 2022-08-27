package com.lujun61.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @PathVariable : 从url中获取数据
 *
 * @GetMapping: 支持get请求方式， 等同于 @RequestMapping( method=RequestMethod.GET)
 *
 * @PostMapping: 支持post请求方式 ，等同于 @RequestMapping( method=RequestMethod.POST)
 *
 * @PutMapping: 支持put请求方式， 等同于 @RequestMapping( method=RequestMethod.PUT)
 *
 * @DeleteMapping: 支持delete请求方式， 等同于 @RequestMapping( method=RequestMethod.DELETE)
 *
 * @RestController: 复合注解， 是@Controller 和@ResponseBody组合
 *
 * 在类的上面使用@RestController ， 表示当前类者的所有方法都加入了 @ResponseBody
 */


/**
 * 本类中的所有业务逻辑代码仅供参考阅读。
 * 并不能直接访问运行
 */
@RestController
public class MyRestController {
    //get 请求
    /**
     * rest 中， url 要使用占位符，表示传递的数据。
     * 占位符叫做【路径变量】， 是在 url 中的数据
     *
     * 格式： 在@RequestMapping 的 value 属性值中，使用 {自定义名称}
     *
     * @PathVariable: 路径变量注解，作用是获取 url 中的路径变量的值
     * 属性： value ： 自定义路径变量名称
     * 位置： 在逐个接收参数中，在形参定义的前面
     *
     * 注意：如果路径变量名和形参名一样， value 可以不写
     *
     * 格外注意：设计路径，必须唯一， 路径 {【uri】 和 【请求方式】}必须唯一。
     */
    @GetMapping(value = "/student/{studentId}/{classname}")
    public String queryStudent(@PathVariable(value = "studentId") Integer id, @PathVariable String classname){
        return "get 请求，查询学生 studentId："+id+", 班级："+classname;
    }

    @PostMapping("/student/{stuId}/{name}/{age}")
    public String createStudent(@PathVariable("stuId") Integer id, @PathVariable String name, @PathVariable Integer age){
        return "post 创建学生， id="+id+",name="+name+",age="+age;
    }

    @PutMapping("/student/{stuId}/{name}")
    public String modifyStudent(@PathVariable("stuId") Integer id, @PathVariable String name){
        System.out.println("===========put 请求方式 ========");
        return "put 修改学生， id="+id+",修改的名称是："+name;
    }

    @DeleteMapping("/student/{stuId}")
    public String removeStudent(@PathVariable("stuId") Integer id){
        System.out.println("===========delete 请求方式 ========");
        return "delete 删除学生，id="+id;
    }
}
