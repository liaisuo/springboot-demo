package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.User;

public interface UserService {
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
    User getUserById(int id);
}
