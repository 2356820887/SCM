package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.User;
import com.chino.scm.service.UserService;
import com.chino.scm.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    Map<String, Object> data = new HashMap<>();

    /**
     * 登录
     *
     * @param user 用户
     * @return 返回响应代码，数据，token，响应消息
     */
    @PostMapping("/login")
    public Result<Map<String, Object>> login(@RequestBody User user) {
        if (user == null || user.getUserName().equals("") || user.getPassword().equals("")) {
            return new Result<>(400, "用户名或密码为空");
        }
        User inputUser = userService.login(user);
        if (inputUser == null) {
            int register = userService.register(user);
            data.put("data", register);
            return new Result<>(200, data, "注册成功");
        }
        data.put("data", inputUser);
        data.put("token", JWTUtils.getToken(inputUser));
        return new Result<>(200, data, "登录成功");
    }
}
