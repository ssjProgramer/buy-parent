package com.ssj.serviceImpl;

import com.ssj.dao.UserDao;
import com.ssj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: SuiShiJie
 * @Description:
 * @Date: Created in 11:27 2018/12/14
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryById() {
        return userDao.queryById();
    }
}
