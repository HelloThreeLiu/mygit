package com.itlsr.service.impl;

import com.itlsr.dao.UserDao;
import com.itlsr.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liusr
 * @create 2022-04-04
 * @package com.itlsr.service.impl
 */
//<bean id="userService" class="com.itlsr.service.impl.UserServiceImpl">
    //@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"></property>
    //@Autowired//按照数据类型从spring容器中进行匹配的
    //@Qualifier("userDao")//是按照id值从容器中进行匹配的，但是此处@Qualifier结合@Autowired一起使用
    @Resource(name = "userDao")//相当于@Qualifier + @Autowired
    private UserDao userDao;
//如果使用xml配置，则需要set方法，如果使用注解，则不需要
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
}
