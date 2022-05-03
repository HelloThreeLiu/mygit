package com.itlsr.service.impl;

import com.itlsr.dao.UserDao;
import com.itlsr.service.UserService;

/**
 * @author liusr
 * @create 2022-04-05
 * @package com.itlsr.service.impl
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
