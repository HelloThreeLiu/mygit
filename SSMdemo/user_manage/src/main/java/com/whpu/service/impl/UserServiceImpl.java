package com.whpu.service.impl;

import com.whpu.mapper.UserMapper;
import com.whpu.pojo.User;
import com.whpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liusr
 * @create 2022-04-27
 * @package com.whpu.service.impl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void registerUser(String phone) {
       User user = userMapper.findUserByPhone(phone);
       if (user==null){
           user = new User();
           user.setPhone(phone);
           userMapper.save(user);
       }
    }
}
