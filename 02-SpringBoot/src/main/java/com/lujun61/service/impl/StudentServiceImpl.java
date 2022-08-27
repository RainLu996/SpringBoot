package com.lujun61.service.impl;

import com.lujun61.dao.StudentDao;
import com.lujun61.pojo.Student;
import com.lujun61.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
//@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectStudentById(id);
    }
}
