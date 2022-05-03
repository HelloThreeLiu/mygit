package com.itlsr.dao.impl;

import com.itlsr.dao.UserDao;

/**
 * @author liusr
 * @create 2022-03-23
 * @package com.itlsr
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("UserDaoImpl创建。。。");
    }

    @Override
    public void save() {
        System.out.println("UserDao save method running...");
    }
}
