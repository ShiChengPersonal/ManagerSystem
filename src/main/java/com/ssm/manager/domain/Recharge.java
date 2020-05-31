package com.ssm.manager.domain;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:41
 * @Author: shicheng
 * @Description:
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 充值实体类
 */
public class Recharge implements Serializable {
    private Integer r_id;//编号
    private double r_money;//剩余金额，保留两位小数
    private Integer r_userId;//充值的用户id
    private Integer r_managerId;//办理的管理员id
    private double r_now;//当前充值金额，保留两位小数
    private double r_all;//总充值金额，保留两位小数
    private Date r_createTime;//创建时间
    private Date r_updateTime;//最后修改时间
    private String r_remarks;//备注

    public Recharge() {
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public double getR_money() {
        return r_money;
    }

    public void setR_money(double r_money) {
        this.r_money = r_money;
    }

    public Integer getR_userId() {
        return r_userId;
    }

    public void setR_userId(Integer r_userId) {
        this.r_userId = r_userId;
    }

    public Integer getR_managerId() {
        return r_managerId;
    }

    public void setR_managerId(Integer r_managerId) {
        this.r_managerId = r_managerId;
    }

    public double getR_now() {
        return r_now;
    }

    public void setR_now(double r_now) {
        this.r_now = r_now;
    }

    public double getR_all() {
        return r_all;
    }

    public void setR_all(double r_all) {
        this.r_all = r_all;
    }

    public Date getR_createTime() {
        return r_createTime;
    }

    public void setR_createTime(Date r_createTime) {
        this.r_createTime = r_createTime;
    }

    public Date getR_updateTime() {
        return r_updateTime;
    }

    public void setR_updateTime(Date r_updateTime) {
        this.r_updateTime = r_updateTime;
    }

    public String getR_remarks() {
        return r_remarks;
    }

    public void setR_remarks(String r_remarks) {
        this.r_remarks = r_remarks;
    }

    @Override
    public String toString() {
        return "Recharge{" +
                "r_id=" + r_id +
                ", r_money=" + r_money +
                ", r_userId=" + r_userId +
                ", r_managerId=" + r_managerId +
                ", r_now=" + r_now +
                ", r_all=" + r_all +
                ", r_createTime=" + r_createTime +
                ", r_updateTime=" + r_updateTime +
                ", r_remarks='" + r_remarks + '\'' +
                '}';
    }
}
