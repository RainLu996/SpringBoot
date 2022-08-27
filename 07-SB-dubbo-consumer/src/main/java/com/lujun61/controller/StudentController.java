package com.lujun61.controller;

import com.lujun61.intf.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /**
     * 引用远程服务，将创建好的代理对象注入给studentService
     */
    @DubboReference(interfaceClass = StudentService.class, version = "1.0")

    /*
        如果没有使用interfaceClass，默认就是该 引用类型 的class
    @DubboReference(version = "1.0")*/
    private StudentService studentService;

    @GetMapping("/get")
    public String queryStudent(Integer id, String name) {
        return "创建的学生对象：" + studentService.getUser(id, name);
    }
}
