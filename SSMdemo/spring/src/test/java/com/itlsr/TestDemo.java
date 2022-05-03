package com.itlsr;

import com.itlsr.dao.UserDao;
import com.itlsr.dao.impl.UserDaoImpl;
import com.itlsr.service.UserService;
import com.itlsr.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusr
 * @create 2022-03-23
 * @package com.itlsr
 */
public class TestDemo {
    @Test
    public void test1(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = context.getBean(UserDaoImpl.class);
        userDao.save();
    }

    @Test
    public void test2(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save();
    }
}
