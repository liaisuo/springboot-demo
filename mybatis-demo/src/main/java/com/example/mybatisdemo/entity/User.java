package com.example.mybatisdemo.entity;

import java.time.LocalDateTime;

/**
 * @file: com.example.mybatisdemo.entity.User
 * @description:
 * @author: liaisuo20190810
 * @date: 2021-01-15
 * @version: V1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class User {
    private int id;

    private String userName;

    private Integer age;

    private LocalDateTime createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", createTime=" + createTime +
                '}';
    }
}
