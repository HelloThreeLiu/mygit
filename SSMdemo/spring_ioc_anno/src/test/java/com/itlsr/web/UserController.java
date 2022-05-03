package com.itlsr.web;

import com.itlsr.config.SpringConfiguration;
import com.itlsr.service.UserService;
import com.itlsr.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusr
 * @create 2022-04-05
 * @package com.itlsr.web
 */
public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
