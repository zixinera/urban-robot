package com.xhu.nine.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import com.xhu.nine.dto.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    void deleteByUserId(Integer userId);
    void insertUser(User user);
    User selectUserById(Integer userId);
    User selectUserByName(String userName);
    List<User> findUser();

@Delete("delete from p_user where user_id=#{id}")
    void deleteUser(int id);
}
