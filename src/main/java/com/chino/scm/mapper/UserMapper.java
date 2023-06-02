package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where username = #{userName}")
    User selectByUsername(String username);

    @Insert("INSERT INTO `user` (`username`, `password`) VALUES (#{userName}, #{password})")
    int register(User user);
}