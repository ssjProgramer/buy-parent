package com.ssj.dao;

/**
 * @Author: SuiShiJie
 * @Description:
 * @Date: Created in 12:14 2018/12/16
 * @Modified By:
 */
public class User {
    private Integer id;
    private String userName;
    private String userPwd;
//    测试用

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
