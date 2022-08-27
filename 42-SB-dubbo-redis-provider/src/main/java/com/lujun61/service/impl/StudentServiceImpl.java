package com.lujun61.service.impl;

import com.lujun61.pojo.Student;
import com.lujun61.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getUser(Integer id, String name) {
        return new Student(id, null, name);
    }

    @Override
    public Integer getUserNum() {
        return 668;
    }
}
