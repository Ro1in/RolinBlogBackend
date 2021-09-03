package com.rolin.blogapi.mapper;

import com.rolin.blogapi.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER")
    List<User> getAllUsers();

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO user(username,email,password,avatar,last_login) " +
            "VALUES (#{username},#{email},#{password},#{avatar},#{lastLogin}) ")
    int insertUser(User user);


}
