package com.itlsr.demo;

import com.itlsr.dao.impl.UserDaoImpl;
import com.itlsr.service.UserService;
import com.itlsr.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusr
 * @create 2022-03-24
 * @package com.itlsr.demo
 */
public class UserController {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save();

    }
}
