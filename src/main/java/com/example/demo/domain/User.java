package com.example.demo.domain;
/**
 * user entity Class
 *
 * @author qichao
 * @date 06/23/2020
 */
public class User {
    private String userId;//身份证号码
    private String userName;
    private String pwd;//默认6个1
    private String userAvatar;//用户照片路径及文件名，如：'/avatar/john.jpg'
    private String departId;
    private String branchId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
