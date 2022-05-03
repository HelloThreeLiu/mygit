package com.whpu.test;

import com.whpu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author liusr
 * @create 2022-04-21
 * @package com.whpu.test
 */
public class MyBatisTest {

    /*@Test
    //查询
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> userList = sqlSession.selectList("userMapper.findALL");

        System.out.println(userList);

        sqlSession.close();
    }

    @Test
    //添加
    public void test2() throws IOException {

        User user = new User();
        user.setUsername("zhaoliu");
        user.setPassword("abc");

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        int i = sqlSession.insert("userMapper.save", user);

        sqlSession.commit();

        System.out.println(i);

        sqlSession.close();
    }

    @Test
    //修改
    public void test3() throws IOException {

        User user = new User();
        user.setId(5);
        user.setUsername("tom");
        user.setPassword("1234");

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        int i = sqlSession.update("userMapper.update", user);

        sqlSession.commit();

        System.out.println(i);

        sqlSession.close();
    }

    @Test
    //删除
    public void test4() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        int i = sqlSession.delete("userMapper.delete",5);

        sqlSession.commit();

        System.out.println(i);

        sqlSession.close();
    }*/
}
