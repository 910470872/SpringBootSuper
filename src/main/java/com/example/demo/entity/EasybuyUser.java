package com.example.demo.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author mymx,jih
*/
@Entity
@Table(name = "easybuy_user")
public class EasybuyUser implements Serializable {

    private static final long serialVersionUID = 1540787261082L;
    /**
    * 主键
    * 主键
    * isNullAble:0
    */
    @Id
    @GeneratedValue
    private Integer id;

    /**
    * 登录名
    * isNullAble:0
    */
    @Column(name="loginname")
    private String loginName;

    /**
    * 用户名
    * isNullAble:0
    */
    @Column(name="username")
    private String userName;

    /**
    * 密码
    * isNullAble:0
    */
    @Column
    private String password;

    /**
    * 性别(1:男 0：女)
    * isNullAble:0,defaultVal:1
    */
    @Column
    private Integer sex;

    /**
    * 身份证号
    * isNullAble:1
    */
    @Column(name="identitycode")
    private String identityCode;

    /**
    * 邮箱
    * isNullAble:1
    */
    @Column
    private String email;

    /**
    * 手机
    * isNullAble:1
    */
    @Column
    private String mobile;

    /**
    * 类型（1：后台 0:前台）
    * isNullAble:1,defaultVal:0
    */
    @Column
    private Integer type;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setLoginName(String loginName){this.loginName = loginName;}

    public String getLoginName(){return this.loginName;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setSex(Integer sex){this.sex = sex;}

    public Integer getSex(){return this.sex;}

    public void setIdentityCode(String identityCode){this.identityCode = identityCode;}

    public String getIdentityCode(){return this.identityCode;}

    public void setEmail(String email){this.email = email;}

    public String getEmail(){return this.email;}

    public void setMobile(String mobile){this.mobile = mobile;}

    public String getMobile(){return this.mobile;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}
    @Override
    public String toString() {
        return "EasybuyUser{" +
                "id='" + id + '\'' +
                "loginName='" + loginName + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
                "sex='" + sex + '\'' +
                "identityCode='" + identityCode + '\'' +
                "email='" + email + '\'' +
                "mobile='" + mobile + '\'' +
                "type='" + type + '\'' +
            '}';
    }

    }



