package com.example.mybatisplusdemo.entity;

/**
 * @file: com.example.mybatisplusdemo.entity.UserParams
 * @description:
 * @author: liaisuo20190810
 * @date: 2021-01-17
 * @version: V1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class UserParams {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 每页数据条数
     */
    private Integer pageSize;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "UserParams{" +
                "userName='" + userName + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
