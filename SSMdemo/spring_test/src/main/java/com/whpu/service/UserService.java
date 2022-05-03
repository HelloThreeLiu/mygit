package com.whpu.service;

import com.whpu.domain.User;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.service
 */
public interface UserService {
    List<User> list();

    void save(User user, long[] roleIds);

    void del(Long userId);

    User login(String username, String password);
}
