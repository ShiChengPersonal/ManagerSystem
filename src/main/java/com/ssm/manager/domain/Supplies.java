package com.ssm.manager.domain;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:36
 * @Author: shicheng
 * @Description:
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 用品实体类
 */
public class Supplies implements Serializable {
    private Integer s_id;//编号
    private String s_name;//名称
    private Integer s_amount;//当前数量
    private double s_price;//单价，保留两位小数
    private Integer s_mouth;//当月买入数量
    private Integer s_all;//总买入数量
    private Integer s_managerId;//办理的管理员id
    private Date s_createTime;//创建时间
    private Date s_updateTime;//最后修改时间
    private String s_remarks;//备注

    public Supplies() {
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getS_amount() {
        return s_amount;
    }

    public void setS_amount(Integer s_amount) {
        this.s_amount = s_amount;
    }

    public double getS_price() {
        return s_price;
    }

    public void setS_price(double s_price) {
        this.s_price = s_price;
    }

    public Integer getS_mouth() {
        return s_mouth;
    }

    public void setS_mouth(Integer s_mouth) {
        this.s_mouth = s_mouth;
    }

    public Integer getS_all() {
        return s_all;
    }

    public void setS_all(Integer s_all) {
        this.s_all = s_all;
    }

    public Integer getS_managerId() {
        return s_managerId;
    }

    public void setS_managerId(Integer s_managerId) {
        this.s_managerId = s_managerId;
    }

    public Date getS_createTime() {
        return s_createTime;
    }

    public void setS_createTime(Date s_createTime) {
        this.s_createTime = s_createTime;
    }

    public Date getS_updateTime() {
        return s_updateTime;
    }

    public void setS_updateTime(Date s_updateTime) {
        this.s_updateTime = s_updateTime;
    }

    public String getS_remarks() {
        return s_remarks;
    }

    public void setS_remarks(String s_remarks) {
        this.s_remarks = s_remarks;
    }

    @Override
    public String toString() {
        return "Supplies{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_amount=" + s_amount +
                ", s_price=" + s_price +
                ", s_mouth=" + s_mouth +
                ", s_all=" + s_all +
                ", s_managerId=" + s_managerId +
                ", s_createTime=" + s_createTime +
                ", s_updateTime=" + s_updateTime +
                ", s_remarks='" + s_remarks + '\'' +
                '}';
    }
}
