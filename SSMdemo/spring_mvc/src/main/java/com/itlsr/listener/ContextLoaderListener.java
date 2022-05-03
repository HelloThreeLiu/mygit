package com.itlsr.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author liusr
 * @create 2022-04-05
 * @package com.itlsr.listener
 */
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        //读取web.xml中的全局参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring的应用上下文对象存储到ServletContext域中

        servletContext.setAttribute("app",app);
        System.out.println("spring 容器创建完毕...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
