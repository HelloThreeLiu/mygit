package com.whpu.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whpu.domain.User;
import com.whpu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author liusr
 * @create 2022-04-22
 * @package com.whpu.test
 */
public class MapperTest {

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User condition = new User();
        condition.setId(1);
        condition.setUsername("zhangsan");
        condition.setPassword("123");

        List<User> userList = mapper.findByCondition(condition);

        System.out.println(userList);

        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //设置分页相关参数，当前页+每页显示条数
        PageHelper.startPage(1,3);

        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        //获取分页相关参数
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());

        sqlSession.close();
    }
}
