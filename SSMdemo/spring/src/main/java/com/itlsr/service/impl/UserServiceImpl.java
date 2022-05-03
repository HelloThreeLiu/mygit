package com.itlsr.service.impl;

import com.itlsr.dao.UserDao;
import com.itlsr.dao.impl.UserDaoImpl;
import com.itlsr.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusr
 * @create 2022-03-23
 * @package com.itlsr.service.impl
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
//  1.set方法注入依赖
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //2.有参构造注入依赖

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public void save() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
//        UserDao userDao = context.getBean(UserDaoImpl.class);
//        userDao.save();
        userDao.save();
    }
}
