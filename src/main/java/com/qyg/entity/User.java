package com.qyg.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String userPwd;
    private String realName;
    private String sex;
    private Date birthday;
    private Timestamp createdatetime;
    private String remark;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Timestamp createdatetime) {
        this.createdatetime = createdatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User() {

    }

    public User(Integer id, String userName, String userPwd, String realName, String sex, Date birthday,
                Timestamp createdatetime, String remark) {
        super();
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.realName = realName;
        this.sex = sex;
        this.birthday = birthday;
        this.createdatetime = createdatetime;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", realName=" + realName
                + ", sex=" + sex + ", birthday=" + birthday + ", createdatetime=" + createdatetime + ", remark="
                + remark + ";\n";
    }

}

