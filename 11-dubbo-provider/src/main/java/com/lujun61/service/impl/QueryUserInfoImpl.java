package com.lujun61.service.impl;

import com.lujun61.pojo.User;
import com.lujun61.service.QueryUserInfo;

public class QueryUserInfoImpl implements QueryUserInfo {
    @Override
    public User queryUserInfo() {
        return new User(19, "lujun");
    }
}
