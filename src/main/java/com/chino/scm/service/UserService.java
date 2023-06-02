package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.Users;

public interface UserService extends IService<Users> {
    Users login(Users users);
}
