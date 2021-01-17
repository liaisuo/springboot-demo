package com.example.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;

/**
 * @file: com.example.mybatisdemo.entity.User
 * @description:
 * @author: liaisuo20190810
 * @date: 2021-01-15
 * @version: V1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
@TableName(value = "user")
public class User {
    @TableId
    private Integer id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableLogic
    private Integer flag;

    @Version
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", createTime=" + createTime +
                ", flag=" + flag +
                ", version=" + version +
                '}';
    }
}
