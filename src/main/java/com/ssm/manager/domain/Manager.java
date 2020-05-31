package com.ssm.manager.domain;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:10
 * @Author: shicheng
 * @Description:
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员实体类
 */
public class Manager implements Serializable {
    private Integer m_id;//管理员编号
    private String m_name;//管理员姓名
    private String m_gender;//管理员性别
    private String m_IDcard;//身份证
    private String m_address;//地址
    private String m_phone;//联系电话
    private String m_caption;//个人说明
    private String m_remarks;//备注
    private Date createTime;//创建时间
    private Date updateTime;//最后修改时间
    private int m_type;//管理员类型，取值为{1，2}，1为系统管理员，2为业务管理员

    public Manager() {
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_gender() {
        return m_gender;
    }

    public void setM_gender(String m_gender) {
        this.m_gender = m_gender;
    }

    public String getM_IDcard() {
        return m_IDcard;
    }

    public void setM_IDcard(String m_IDcard) {
        this.m_IDcard = m_IDcard;
    }

    public String getM_address() {
        return m_address;
    }

    public void setM_address(String m_address) {
        this.m_address = m_address;
    }

    public String getM_phone() {
        return m_phone;
    }

    public void setM_phone(String m_phone) {
        this.m_phone = m_phone;
    }

    public String getM_caption() {
        return m_caption;
    }

    public void setM_caption(String m_caption) {
        this.m_caption = m_caption;
    }

    public String getM_remarks() {
        return m_remarks;
    }

    public void setM_remarks(String m_remarks) {
        this.m_remarks = m_remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getM_type() {
        return m_type;
    }

    public void setM_type(int m_type) {
        this.m_type = m_type;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_id=" + m_id +
                ", m_name='" + m_name + '\'' +
                ", m_gender='" + m_gender + '\'' +
                ", m_IDcard='" + m_IDcard + '\'' +
                ", m_address='" + m_address + '\'' +
                ", m_phone='" + m_phone + '\'' +
                ", m_caption='" + m_caption + '\'' +
                ", m_remarks='" + m_remarks + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", m_type=" + m_type +
                '}';
    }
}
