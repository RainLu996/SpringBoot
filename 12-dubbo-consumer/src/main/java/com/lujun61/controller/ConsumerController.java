package com.lujun61.controller;

import com.lujun61.service.QueryUserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ConsumerController {
    @Resource
    QueryUserInfo userInfoService;

    @RequestMapping("/query.do")
    public String queryUserInfo(Model model) {
        model.addAttribute("info", userInfoService.queryUserInfo());

        return "result";
    }
}
