package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @file: com.example.mybatisdemo.controller.UserController
 * @description:
 * @author: liaisuo20190810
 * @date: 2021-01-15
 * @version: V1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/saveUser")
    public Boolean saveUser(@RequestBody User user) {
        logger.info("新增用户信息:{}", user);
        int ret = userService.insertUser(user);
        return ret == 1 ? Boolean.TRUE : Boolean.FALSE;
    }

    @PostMapping("/deleteUser")
    public Boolean deleteUser(int id) {
        logger.info("根据用户id删除用户信息:{}", id);
        int ret = userService.deleteUserById(id);
        return ret == 1 ? Boolean.TRUE : Boolean.FALSE;
    }

    @PostMapping("/updateUser")
    public Boolean updateUser(@RequestBody User user) {
        logger.info("更新用户信息:{}", user);
        int ret = userService.updateUser(user);
        return ret == 1 ? Boolean.TRUE : Boolean.FALSE;
    }

    @GetMapping("/getUser")
    public User getUser(int id) {
        logger.info("根据用户id查询用户信息:{}", id);
        User user = userService.getUserById(id);
        return user;
    }
}
