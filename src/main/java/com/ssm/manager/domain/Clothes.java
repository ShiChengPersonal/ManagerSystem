package com.ssm.manager.domain;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:23
 * @Author: shicheng
 * @Description:
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 衣物实体表
 */
public class Clothes implements Serializable {
    private Integer c_id;//编号
    private String c_name;//名称
    private String c_type;//类型
    private double c_price;//清洗价格，保留两位小数
    private Integer c_managerId;//办理的管理员id
    private Date c_createTime;//创建时间
    private Date c_updateTime;//最后修改时间
    private String c_remarks;//备注

    public Clothes() {
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public double getC_price() {
        return c_price;
    }

    public void setC_price(double c_price) {
        this.c_price = c_price;
    }

    public Integer getC_managerId() {
        return c_managerId;
    }

    public void setC_managerId(Integer c_managerId) {
        this.c_managerId = c_managerId;
    }

    public Date getC_createTime() {
        return c_createTime;
    }

    public void setC_createTime(Date c_createTime) {
        this.c_createTime = c_createTime;
    }

    public Date getC_updateTime() {
        return c_updateTime;
    }

    public void setC_updateTime(Date c_updateTime) {
        this.c_updateTime = c_updateTime;
    }

    public String getC_remarks() {
        return c_remarks;
    }

    public void setC_remarks(String c_remarks) {
        this.c_remarks = c_remarks;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_type='" + c_type + '\'' +
                ", c_price=" + c_price +
                ", c_managerId=" + c_managerId +
                ", c_createTime=" + c_createTime +
                ", c_updateTime=" + c_updateTime +
                ", c_remarks='" + c_remarks + '\'' +
                '}';
    }
}
