package com.lujun61.service;

import com.lujun61.pojo.User;

public class UserServiceImpl implements UserService{
    @Override
    public User getUser() {
        return new User(19, "lujun");
    }

    @Override
    public Integer getUserNum() {
        return 1;
    }
}
