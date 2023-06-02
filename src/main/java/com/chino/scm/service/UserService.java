package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.User;

public interface UserService extends IService<User> {
    User login(User user);

    int register(User user);
}
