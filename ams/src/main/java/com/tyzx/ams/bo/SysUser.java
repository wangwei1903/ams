package com.tyzx.ams.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysUser implements Serializable {
    /**
     * 用户ID
     * 表字段 : sys_user.user_id
     */
    private Integer userId;

    /**
     * 系统编码
     * 表字段 : sys_user.system_no
     */
    private String systemNo;

    /**
     * 合作商编号
     * 表字段 : sys_user.partners_id
     */
    private Integer partnersId;

    /**
     * 用户名
     * 表字段 : sys_user.user_name
     */
    private String userName;

    /**
     * 用户密码
     * 表字段 : sys_user.user_password
     */
    private String userPassword;

    /**
     * 真实姓名
     * 表字段 : sys_user.user_real_name
     */
    private String userRealName;

    /**
     * 性别
     * 表字段 : sys_user.user_sex
     */
    private String userSex;

    /**
     * 手机
     * 表字段 : sys_user.user_mobile
     */
    private String userMobile;

    /**
     * 电话
     * 表字段 : sys_user.user_tel
     */
    private String userTel;

    /**
     * 邮箱
     * 表字段 : sys_user.user_email
     */
    private String userEmail;

    /**
     * 提成比例
     * 表字段 : sys_user.allot_rate
     */
    private BigDecimal allotRate;

    /**
     * 用户类型(总管理员：super 普通管理员：ordinary 合作商：partners)
     * 表字段 : sys_user.type
     */
    private String type;

    /**
     * 锁定标记（锁定时不能登录后台系统）
     * 表字段 : sys_user.is_lock
     */
    private String isLock;

    /**
     * 删除标记
     * 表字段 : sys_user.is_delete
     */
    private String isDelete;

    /**
     * 创建时间
     * 表字段 : sys_user.add_time
     */
    private String addTime;

    /**
     * 创建人
     * 表字段 : sys_user.add_user_id
     */
    private Integer addUserId;

    /**
     * 修改时间
     * 表字段 : sys_user.edit_time
     */
    private String editTime;

    /**
     * 修改人
     * 表字段 : sys_user.edit_user_id
     */
    private Integer editUserId;

    /**
     * 用户备注
     * 表字段 : sys_user.user_notes
     */
    private String userNotes;

    /**
     * 序列化标记
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     * 表字段 : sys_user.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * 表字段 : sys_user.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 系统编码
     * 表字段 : sys_user.system_no
     */
    public String getSystemNo() {
        return systemNo;
    }

    /**
     * 系统编码
     * 表字段 : sys_user.system_no
     */
    public void setSystemNo(String systemNo) {
        this.systemNo = systemNo == null ? null : systemNo.trim();
    }

    /**
     * 合作商编号
     * 表字段 : sys_user.partners_id
     */
    public Integer getPartnersId() {
        return partnersId;
    }

    /**
     * 合作商编号
     * 表字段 : sys_user.partners_id
     */
    public void setPartnersId(Integer partnersId) {
        this.partnersId = partnersId;
    }

    /**
     * 用户名
     * 表字段 : sys_user.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * 表字段 : sys_user.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户密码
     * 表字段 : sys_user.user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 用户密码
     * 表字段 : sys_user.user_password
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 真实姓名
     * 表字段 : sys_user.user_real_name
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * 真实姓名
     * 表字段 : sys_user.user_real_name
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * 性别
     * 表字段 : sys_user.user_sex
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 性别
     * 表字段 : sys_user.user_sex
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * 手机
     * 表字段 : sys_user.user_mobile
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 手机
     * 表字段 : sys_user.user_mobile
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 电话
     * 表字段 : sys_user.user_tel
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 电话
     * 表字段 : sys_user.user_tel
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    /**
     * 邮箱
     * 表字段 : sys_user.user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 邮箱
     * 表字段 : sys_user.user_email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 提成比例
     * 表字段 : sys_user.allot_rate
     */
    public BigDecimal getAllotRate() {
        return allotRate;
    }

    /**
     * 提成比例
     * 表字段 : sys_user.allot_rate
     */
    public void setAllotRate(BigDecimal allotRate) {
        this.allotRate = allotRate;
    }

    /**
     * 用户类型(总管理员：super 普通管理员：ordinary 合作商：partners)
     * 表字段 : sys_user.type
     */
    public String getType() {
        return type;
    }

    /**
     * 用户类型(总管理员：super 普通管理员：ordinary 合作商：partners)
     * 表字段 : sys_user.type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 锁定标记（锁定时不能登录后台系统）
     * 表字段 : sys_user.is_lock
     */
    public String getIsLock() {
        return isLock;
    }

    /**
     * 锁定标记（锁定时不能登录后台系统）
     * 表字段 : sys_user.is_lock
     */
    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }

    /**
     * 删除标记
     * 表字段 : sys_user.is_delete
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 删除标记
     * 表字段 : sys_user.is_delete
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * 创建时间
     * 表字段 : sys_user.add_time
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * 创建时间
     * 表字段 : sys_user.add_time
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    /**
     * 创建人
     * 表字段 : sys_user.add_user_id
     */
    public Integer getAddUserId() {
        return addUserId;
    }

    /**
     * 创建人
     * 表字段 : sys_user.add_user_id
     */
    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    /**
     * 修改时间
     * 表字段 : sys_user.edit_time
     */
    public String getEditTime() {
        return editTime;
    }

    /**
     * 修改时间
     * 表字段 : sys_user.edit_time
     */
    public void setEditTime(String editTime) {
        this.editTime = editTime == null ? null : editTime.trim();
    }

    /**
     * 修改人
     * 表字段 : sys_user.edit_user_id
     */
    public Integer getEditUserId() {
        return editUserId;
    }

    /**
     * 修改人
     * 表字段 : sys_user.edit_user_id
     */
    public void setEditUserId(Integer editUserId) {
        this.editUserId = editUserId;
    }

    /**
     * 用户备注
     * 表字段 : sys_user.user_notes
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * 用户备注
     * 表字段 : sys_user.user_notes
     */
    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes == null ? null : userNotes.trim();
    }

    /**
     * 
     * @param  that
     * 
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSystemNo() == null ? other.getSystemNo() == null : this.getSystemNo().equals(other.getSystemNo()))
            && (this.getPartnersId() == null ? other.getPartnersId() == null : this.getPartnersId().equals(other.getPartnersId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getAllotRate() == null ? other.getAllotRate() == null : this.getAllotRate().equals(other.getAllotRate()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsLock() == null ? other.getIsLock() == null : this.getIsLock().equals(other.getIsLock()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getAddUserId() == null ? other.getAddUserId() == null : this.getAddUserId().equals(other.getAddUserId()))
            && (this.getEditTime() == null ? other.getEditTime() == null : this.getEditTime().equals(other.getEditTime()))
            && (this.getEditUserId() == null ? other.getEditUserId() == null : this.getEditUserId().equals(other.getEditUserId()))
            && (this.getUserNotes() == null ? other.getUserNotes() == null : this.getUserNotes().equals(other.getUserNotes()));
    }

    /**
     * 
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSystemNo() == null) ? 0 : getSystemNo().hashCode());
        result = prime * result + ((getPartnersId() == null) ? 0 : getPartnersId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getAllotRate() == null) ? 0 : getAllotRate().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsLock() == null) ? 0 : getIsLock().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getAddUserId() == null) ? 0 : getAddUserId().hashCode());
        result = prime * result + ((getEditTime() == null) ? 0 : getEditTime().hashCode());
        result = prime * result + ((getEditUserId() == null) ? 0 : getEditUserId().hashCode());
        result = prime * result + ((getUserNotes() == null) ? 0 : getUserNotes().hashCode());
        return result;
    }

    /**
     * 
     * 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", systemNo=").append(systemNo);
        sb.append(", partnersId=").append(partnersId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userTel=").append(userTel);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", allotRate=").append(allotRate);
        sb.append(", type=").append(type);
        sb.append(", isLock=").append(isLock);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addTime=").append(addTime);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", userNotes=").append(userNotes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}