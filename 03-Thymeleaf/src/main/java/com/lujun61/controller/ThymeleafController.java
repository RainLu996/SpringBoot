package com.lujun61.controller;

import com.lujun61.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/thyl")
public class ThymeleafController {
    //标准表达式
    @GetMapping("/standard")
    public String expresssion(Model model){
        //添加简单类型的数据
        model.addAttribute("site","jingzhou");
        //对象类型
        model.addAttribute("student", new Student(1, "Lujun", 19));
        return "standard";
    }

    //选择表达式
    @GetMapping("/select")
    public String expresssion2(Model model){
        //添加简单类型的数据
        model.addAttribute("site","jingzhou");

        //对象类型
        model.addAttribute("student", new Student(1, "Lujun", 19));
        return "select";
    }

    //链接表达式
    @GetMapping("/link")
    public String link(Model model){
        model.addAttribute("stuId",1001);
        return "link";
    }

    @GetMapping("/query/student")
    @ResponseBody
    public String query(Integer id){
        return "查询学生 id="+id;
    }

    @GetMapping("/find/school")
    @ResponseBody
    public String query2(Integer id, String name){
        return "查询 2，id="+id+",姓名="+name;
    }

    //模版属性
    @GetMapping("/property")
    public String htmlProperty(Model model){
        model.addAttribute("requestMethod", "post");
        model.addAttribute("name","lujun");
        return "property";
    }

    @PostMapping("/print")
    @ResponseBody
    public String printProperty(String username) {
        System.out.println(username);
        return username;
    }


    @GetMapping("/each")
    public String eachList(Model model){
        /* ========================循环 list================================ */
        List<String> strList = new ArrayList<>();
        strList.add("三国");
        strList.add("三国志");
        strList.add("水浒");
        model.addAttribute("strlist",strList);

        List<Student> userList = new ArrayList<>();
        userList.add(new Student(1001,"张飞",20));
        userList.add(new Student(1002,"刘备",29));
        userList.add(new Student(1003,"关羽",28));
        model.addAttribute("userList",userList);


/* ========================循环 Array================================ */
        Student[] users = new Student[3];
        users[0]= new Student(1001,"马超",22);
        users[1]= new Student(1002,"黄忠",26);
        users[2]= new Student(1003,"赵云",29);
        model.addAttribute("userarray",users);


/* ========================循环 map================================ */
        Map<String,Student> map = new HashMap<>();
        map.put("user1",new Student(1001,"马超",22));
        map.put("user2",new Student(1002,"黄忠",26));
        map.put("user3",new Student(1003,"赵云",29));
        model.addAttribute("users",map);

        //List<Map<Student>
        List<Map<String,Student>> listmap = new ArrayList<>();
        listmap.add(map);
        map = new HashMap<>();
        map.put("sys1",new Student(2001,"曹操",22));
        map.put("sys2",new Student(2002,"孙权",26));
        map.put("sys3",new Student(2003,"刘备",29));
        listmap.add(map);
        model.addAttribute("listmap",listmap);

        return "each";
    }

    @GetMapping("/ifunless")
    public String ifUnless(Model model){
        model.addAttribute("sex","m");
        model.addAttribute("isLogin",true);
        model.addAttribute("age",20);
        model.addAttribute("name","");    //空字符串是true
        model.addAttribute("isNull",null);  //null是false
        return "ifAunless";
    }


    @GetMapping("/switch")
    public String likeSwitch(Model model){
        model.addAttribute("sex","m");
        return "switch";
    }

    //内联
    @GetMapping("/inline")
    public String inline(Model model){
        model.addAttribute("sex","m");
        model.addAttribute("isLogin",true);
        model.addAttribute("age",20);
        model.addAttribute("name","克里斯");
        model.addAttribute("myuser",new Student(1005,"lujun",23));
        return "inline";
    }

    //模版中基本对象
    @GetMapping("/baseObject")
    public String baseObject(Model model, HttpServletRequest request, HttpSession session ){
        request.setAttribute("reqdata","request 中的数据");
        request.getSession().setAttribute("sessdata","session 中数据");
        session.setAttribute("loginname","lujun");
        return "object";
    }

    //自定义模板
    @GetMapping("/custom")
    public String customTemplate() {
        return "demo";
    }

    @GetMapping
    public String naturalFields() {


        return "";
    }
}
