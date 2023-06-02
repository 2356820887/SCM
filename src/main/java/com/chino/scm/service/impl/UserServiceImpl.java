package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.toolkit.EncryptUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.common.Error;
import com.chino.scm.mapper.UserMapper;
import com.chino.scm.pojo.User;
import com.chino.scm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录并验证
     *
     * @param user 输入用户
     * @return 数据库中用户
     */
    @Override
    public User login(User user) {
        String userName = user.getUserName();
        String inputPassword = user.getPassword();
        User dbuser = userMapper.selectByUsername(userName);
        if (dbuser != null) {
            try {
                if (verifyPassword(inputPassword, dbuser.getPassword())) {
                    return dbuser;
                }else {
                    throw new Error("密码不正确");
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    /**
     * 注册方法
     *
     * @param user 输入用户
     * @return 密码加密后用户
     */
    @Override
    public int register(User user) {
        String password = user.getPassword();
        String encryptedPassword;
        // 对密码进行加密
        encryptedPassword = EncryptUtils.md5Base64(password);
        user.setPassword(encryptedPassword);
        return userMapper.register(user);
    }

    /**
     * 校验用户输入的密码是否正确
     *
     * @param inputPassword     用户输入的密码
     * @param encryptedPassword 数据库中已加密的密码
     * @return true：密码正确；false：密码错误
     */
    private boolean verifyPassword(String inputPassword, String encryptedPassword) throws NoSuchAlgorithmException {
        // 对用户输入的密码进行加密
        String encryptedInputPassword = EncryptUtils.md5Base64(inputPassword);
        return encryptedPassword.equals(encryptedInputPassword);
    }
}
