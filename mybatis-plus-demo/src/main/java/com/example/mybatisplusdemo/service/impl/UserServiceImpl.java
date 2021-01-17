package com.example.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplusdemo.dao.UserMapper;
import com.example.mybatisplusdemo.entity.User;
import com.example.mybatisplusdemo.entity.UserParams;
import com.example.mybatisplusdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(User user) {
        user.setCreateTime(LocalDateTime.now());
        int result = userMapper.insert(user);
        return result;
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateUser(User user) {
        // 先获取当前的version值
        User oldUser = userMapper.selectById(user.getId());
        user.setVersion(oldUser.getVersion());
        return userMapper.updateById(user);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public IPage<User> getUserPageList(UserParams userParams) {
        Page<User> pageUser = new Page<>(userParams.getCurrentPage(), userParams.getPageSize());
        // 条件构造器
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        if (userParams.getUserName() != null) {
            userWrapper.like("user_name", userParams.getUserName());
        }
        // 设置排序字段
        userWrapper.orderByAsc("age");
        IPage<User> userPageList = userMapper.selectPage(pageUser, userWrapper);
        return userPageList;
    }

    @Override
    public IPage<User> getUserListPageSelf(UserParams userParams) {
        Page<User> pageUser = new Page<>(userParams.getCurrentPage(), userParams.getPageSize());
        IPage<User> userPageList = userMapper.findUserListPage(pageUser, userParams);
        return userPageList;
    }
}
