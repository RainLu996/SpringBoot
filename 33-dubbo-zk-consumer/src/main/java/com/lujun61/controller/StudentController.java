package com.lujun61.controller;

import com.lujun61.intf.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @Resource
    private StudentService studentService2;

    @RequestMapping("/get.do")
    public String queryStudent(Model model, Integer id, String name) {
        model.addAttribute("stu", studentService.getUser(id, name));
        model.addAttribute("num", studentService.getUserNum());

        return "info";
    }

    @RequestMapping("/get2.do")
    public String queryStudent2(Model model, Integer id, String name) {
        model.addAttribute("stu2", studentService2.getUser(id, name));
        model.addAttribute("num2", studentService2.getUserNum());

        return "info2";
    }
}
