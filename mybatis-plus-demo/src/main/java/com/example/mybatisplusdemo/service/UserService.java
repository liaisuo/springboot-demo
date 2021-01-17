package com.example.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplusdemo.entity.User;
import com.example.mybatisplusdemo.entity.UserParams;

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

    /**
     * 分页查询用户信息
     *
     * @param userParams 参数
     * @return IPage
     */
    IPage<User> getUserPageList(UserParams userParams);

    /**
     * 自定义分页查询用户信息
     *
     * @param userParams 参数
     * @return IPage
     */
    IPage<User> getUserListPageSelf(UserParams userParams);
}
