package com.lujun61.service;

import com.lujun61.pojo.Student;

public interface StudentService {
    /* 模拟一个接口（服务）中的多个业务方法 */
    Student getUser(Integer id, String name);

    Integer getUserNum();
}
