package com.ssm.manager.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:02
 * @Author: shicheng
 * @Description:
 */

/**
 * 用户类，顾客的实体类
 */
public class User implements Serializable {
    private Integer u_id;//用户编号
    private String u_name;//用户姓名
    private String u_gender;//用户性别
    private String u_address;//用户地址
    private String u_phone;//联系电话
    private double u_money;//用户余额，保留两位小数
    private String u_caption;//用户说明
    private String u_remarks;//备注
    private Date u_createTime;//创建时间
    private Date u_updateTime;//最后修改时间

    public User() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_gender() {
        return u_gender;
    }

    public void setU_gender(String u_gender) {
        this.u_gender = u_gender;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public double getU_money() {
        return u_money;
    }

    public void setU_money(double u_money) {
        this.u_money = u_money;
    }

    public String getU_caption() {
        return u_caption;
    }

    public void setU_caption(String u_caption) {
        this.u_caption = u_caption;
    }

    public String getU_remarks() {
        return u_remarks;
    }

    public void setU_remarks(String u_remarks) {
        this.u_remarks = u_remarks;
    }

    public Date getU_createTime() {
        return u_createTime;
    }

    public void setU_createTime(Date u_createTime) {
        this.u_createTime = u_createTime;
    }

    public Date getU_updateTime() {
        return u_updateTime;
    }

    public void setU_updateTime(Date u_updateTime) {
        this.u_updateTime = u_updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_gender='" + u_gender + '\'' +
                ", u_address='" + u_address + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_money=" + u_money +
                ", u_caption='" + u_caption + '\'' +
                ", u_remarks='" + u_remarks + '\'' +
                ", u_createTime=" + u_createTime +
                ", u_updateTime=" + u_updateTime +
                '}';
    }
}
