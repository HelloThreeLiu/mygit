package com.whpu.dao;

import com.whpu.domain.User;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.dao
 */
public interface UserDao {
    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long id, long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);

    User findByUsernameAndPassword(String username, String password);
}
