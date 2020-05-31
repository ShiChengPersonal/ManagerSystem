package com.ssm.manager.domain;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:27
 * @Author: shicheng
 * @Description:
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体类
 */
public class Order implements Serializable {
    private Integer o_id;//订单编号
    private String o_name;//衣物名称
    private String o_type;//衣物类型
    private double o_price;//清洗价格，保留两位小数
    private int o_status;//订单状态。取值为{1=待清洗，2=正在清洗，3=清洗完成，4=取消订单}
    private Date o_createTime;//创建时间
    private Date o_updateTime;//最后修改时间
    private Integer o_userId;//顾客id
    private Integer o_managerId;//管理员id
    private String o_remarks;//备注

    public Order() {
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_type() {
        return o_type;
    }

    public void setO_type(String o_type) {
        this.o_type = o_type;
    }

    public double getO_price() {
        return o_price;
    }

    public void setO_price(double o_price) {
        this.o_price = o_price;
    }

    public int getO_status() {
        return o_status;
    }

    public void setO_status(int o_status) {
        this.o_status = o_status;
    }

    public Date getO_createTime() {
        return o_createTime;
    }

    public void setO_createTime(Date o_createTime) {
        this.o_createTime = o_createTime;
    }

    public Date getO_updateTime() {
        return o_updateTime;
    }

    public void setO_updateTime(Date o_updateTime) {
        this.o_updateTime = o_updateTime;
    }

    public Integer getO_userId() {
        return o_userId;
    }

    public void setO_userId(Integer o_userId) {
        this.o_userId = o_userId;
    }

    public Integer getO_managerId() {
        return o_managerId;
    }

    public void setO_managerId(Integer o_managerId) {
        this.o_managerId = o_managerId;
    }

    public String getO_remarks() {
        return o_remarks;
    }

    public void setO_remarks(String o_remarks) {
        this.o_remarks = o_remarks;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", o_name='" + o_name + '\'' +
                ", o_type='" + o_type + '\'' +
                ", o_price=" + o_price +
                ", o_status='" + o_status + '\'' +
                ", o_createTime=" + o_createTime +
                ", o_updateTime=" + o_updateTime +
                ", o_userId=" + o_userId +
                ", o_managerId=" + o_managerId +
                ", o_remarks='" + o_remarks + '\'' +
                '}';
    }
}
