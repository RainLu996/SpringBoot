package com.lujun61.controller;

import com.lujun61.pojo.Student;
import com.lujun61.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return "查询结果 id 是"+id+", 学生="+student.toString();
    }
}
