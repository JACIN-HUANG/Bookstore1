package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from User where user_id=#{id}")
    public User getUserById(int id);
    @Select("select user_name from user where user_id=#{id}")
    public String getUserNameById(int id);
    @Select("select * from user where user_name=#{username} and password=#{password}")
    public User isLogin(User user);
}
