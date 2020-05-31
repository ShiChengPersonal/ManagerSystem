package com.ssm.manager.services;

import com.ssm.manager.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:50
 * @Author: shicheng
 * @Description:
 */
public interface IUserService {

    /**
     * 查找一个用户，无论使用什么信息查找
     * @param user  传入一个用户对象，无论包括任何信息
     * @return  返回查找到的User对象
     */
    public User findOne(User user);

    /**
     * 查找所有用户
     * @return 返回一个list集合
     */
    public List<User> findAll();

    /**
     * 更新用户数据
     * @param user  传入User对象
     * @return 成功返回true，失败返回false
     */
    public boolean updateUser(User user);

    /**
     * 删除一个对象
     * @param user 传入一个User对象
     * @return 成功返回true，失败返回false
     */
    public boolean deleteUser(User user);

    /**
     * 添加一个用户
     * @param user 传入一个User对象
     * @return 成功返回true，失败返回false
     */
    public void addUser(User user);
}
