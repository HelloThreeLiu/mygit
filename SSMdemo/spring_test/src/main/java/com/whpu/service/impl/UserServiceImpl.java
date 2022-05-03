package com.whpu.service.impl;

import com.whpu.dao.RoleDao;
import com.whpu.dao.UserDao;
import com.whpu.domain.Role;
import com.whpu.domain.User;
import com.whpu.service.UserService;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.service.impl
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList中的每一个User的role数据
        for (User user : userList){
            //获得user的id
            Long id = user.getId();
            //将id作为参数，查询当前userId对应的Role集合数据
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    @Override
    public void save(User user, long[] roleIds) {
        //1.向sys_user表中存储数据
        Long userId = userDao.save(user);
        //2.向sys_user_role表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    @Override
    public void del(Long userId) {
        //1.删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //2.删除sys_user表
        userDao.del(userId);
    }

    @Override
    public User login(String username, String password) {

        try {
            User user = userDao.findByUsernameAndPassword(username,password);
            return user;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}
