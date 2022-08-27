package com.lujun61.service.impl;

import com.lujun61.intf.StudentService;
import com.lujun61.pojo.Student;

public class StudentServiceImpl2 implements StudentService {
    @Override
    public Student getUser(Integer id, String name) {
        return new Student(id, name);
    }

    @Override
    public Integer getUserNum() {
        return 6000;
    }
}
