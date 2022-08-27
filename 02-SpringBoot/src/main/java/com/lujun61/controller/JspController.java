package com.lujun61.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/doJsp")
    public String doJsp(Model model) {
        model.addAttribute("data" , "Hello JSP");
        return "index";
    }
}
