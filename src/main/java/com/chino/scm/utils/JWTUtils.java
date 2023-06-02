package com.chino.scm.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.chino.scm.pojo.User;
import org.springframework.util.ObjectUtils;

import java.util.Calendar;

/**
 * @Author: xuanj
 * @CreateTime: 2022-11-29
 * @Description: TODO
 */
public class JWTUtils {
    //自定义密钥
    private static final String SECRET_KEY = "@Tes*RI#s&";

    /**
     * 获取token
     *
     * @param u user
     * @return token
     */
    public static String getToken(User u) {
        Calendar instance = Calendar.getInstance();
        //默认令牌过期时间7天
        instance.add(Calendar.DATE, 7);

        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("username", u.getUserName()).withClaim("userid", u.getId());
        return builder.withExpiresAt(instance.getTime()).sign(Algorithm.HMAC256(SECRET_KEY));
    }

    /**
     * 验证token合法性 成功返回token
     */
    public static DecodedJWT verify(String token) {
        if (ObjectUtils.isEmpty(token)) {
            System.out.println("token 为空");
        }
        //获取登录用户真正的密码假如数据库查出来的是123456
        //String password="123";
        JWTVerifier build = JWT.require(Algorithm.HMAC256(SECRET_KEY)).build();
        return build.verify(token);
    }

    public static void main(String[] args) {
        User u = new User();
        u.setId(3);
        u.setUserName("admin");
        u.setPassword("123");
        String token = getToken(u);
        System.out.println(token);
        DecodedJWT verify = verify(token);
        System.out.println(verify.getClaim("username").asString());
        System.out.println(verify.getClaim("userid").asInt());
    }

}
