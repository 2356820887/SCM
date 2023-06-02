package com.chino.scm;

import com.chino.scm.mapper.UserMapper;
import com.chino.scm.pojo.User;
import com.chino.scm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScmApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    void selectByUsernameTest() {
        User u = new User();
        u.setId(1);
        u.setUserName("张三");
        u.setPassword("123");
        System.out.println(userMapper.selectByUsername("张三"));
        System.out.println(userService.login(u));
    }

}
