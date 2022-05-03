package com.itlsr.dao.impl;

import com.itlsr.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author liusr
 * @create 2022-04-04
 * @package com.itlsr.dao.impl
 */
//<bean id="userDao" class="com.itlsr.dao.impl.UserDaoImpl"></bean>
    //@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
