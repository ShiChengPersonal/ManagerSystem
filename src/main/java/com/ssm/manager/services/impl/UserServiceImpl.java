package com.ssm.manager.services.impl;

import com.ssm.manager.dao.IUserDao;
import com.ssm.manager.domain.User;
import com.ssm.manager.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ManagerSystem
 * @Date: 2020/5/26/0026 21:57
 * @Author: shicheng
 * @Description:
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public User findOne(User user) {
        System.out.println("findOne方法执行了。。。");
        return iUserDao.findOne(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public void addUser(User user) {
        System.out.println("添加user方法执行了");
        iUserDao.addUser(user);
    }
}
