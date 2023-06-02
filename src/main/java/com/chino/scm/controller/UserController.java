package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.Users;
import com.chino.scm.service.UserService;
import com.chino.scm.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *
     * @param user 用户
     * @return 返回响应代码，数据，token，响应消息
     */
    @PostMapping("/login")
    public Result<Map<String, Object>> login(@RequestBody Users user) {
        Users login = userService.login(user);
        System.out.println(login);
        if (login != null) {
            Map<String, Object> data = new HashMap<>();
            data.put("token", JWTUtils.getToken(login));
            data.put("user", login);
            return new Result<>(200, data, "登录成功");
        }
        return new Result<>(500, "登录失败，请检查账号或密码");
    }
}
