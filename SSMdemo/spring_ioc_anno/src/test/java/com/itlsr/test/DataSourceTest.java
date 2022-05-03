package com.itlsr.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author liusr
 * @create 2022-04-04
 * @package com.itlsr.test
 */
public class DataSourceTest {

    @Test
    public void test4() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    @Test
    //手动创建c3p0数据源
    public void test1() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3333/db1?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("20010214");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

    @Test
    //手动创建druid数据源
    public void test2() throws Exception{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3333/db1?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("20010214");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    //手动创建c3p0数据源(加载properties配置文件方式)
    public void test3() throws Exception{
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");
        //创建数据源对象，设置链接参数
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
