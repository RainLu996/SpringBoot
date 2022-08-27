package com.lujun61.controller;

import com.lujun61.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUser.do")
    public String getUser(Model model) {
        model.addAttribute("info", userService.getUser());
        model.addAttribute("num", userService.getUserNum());

        return "userInfo";
    }
}
