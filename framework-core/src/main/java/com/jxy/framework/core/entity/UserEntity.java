package com.jxy.framework.core.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 用户信息实体类
 * @author JiangXiangyu
 * @since 2018-04-09
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -4946017737613690407L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码（密文）
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别（1-男/2-女/9-未填）
     */
    private Integer gender;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * @return 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return 性别（1-男/2-女/9-未填）
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender 性别（1-男/2-女/9-未填）
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return birthday 生日
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @param birthday 生日
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @return 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return createTime 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modifyTime 修改时间
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime 修改时间
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserEntity [id=").append(id).append(", username=").append(username)
                .append(", password=").append(password).append(", name=").append(name)
                .append(", nickname=").append(nickname).append(", gender=").append(gender)
                .append(", mobile=").append(mobile).append(", email=").append(email)
                .append(", birthday=").append(birthday).append(", address=").append(address)
                .append(", createTime=").append(createTime).append(", modifyTime=").append(modifyTime).append("]");
        return builder.toString();
    }

}