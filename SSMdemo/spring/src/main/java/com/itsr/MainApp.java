package com.itsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusr
 * @create 2022-03-22
 * @package com.itsr
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloSpring helloSpring = context.getBean(HelloSpring.class);
        helloSpring.getMessage();
    }




}
