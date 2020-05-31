package com.ssm.manager.exception;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/27/0027 20:43
 * @Author: shicheng
 * @Description:
 */

/**
 * User对象相关异常，用于处理有关于User的所有异常
 */
public class UserException extends Exception{
    private String name;//异常名称
    private String message;//异常信息

    public UserException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
