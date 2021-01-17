package com.example.mybatisdemo.dao;

import com.example.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return int
     */
    int insertUser(User user);

    /**
     * 根据用户编号删除用户
     *
     * @param id 用户编号
     * @return int
     */
    int deleteUserById(int id);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return int
     */
    int updateUser(User user);

    /**
     * 根据用户编号查询用户信息
     *
     * @param id 用户编号
     * @return User
     */
    User getUserById(Integer id);

}
