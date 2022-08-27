package com.lujun61.service.impl;

import com.lujun61.intf.StudentService;
import com.lujun61.pojo.Student;
import org.apache.dubbo.config.annotation.DubboService;

//@Component可以不用加

/**
 * 暴露接口
 */
@DubboService(interfaceClass = StudentService.class, version = "1.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getUser(Integer id, String name) {
        return new Student(id, name);
    }

    @Override
    public Integer getUserNum() {
        return 668;
    }
}
