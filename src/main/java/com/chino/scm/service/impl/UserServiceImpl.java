package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.UsersMapper;
import com.chino.scm.pojo.Users;
import com.chino.scm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UserService{

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users login(Users users) {
        return usersMapper.login(users);
    }
}