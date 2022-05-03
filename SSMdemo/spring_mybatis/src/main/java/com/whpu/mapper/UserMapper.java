package com.whpu.mapper;

import com.whpu.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author liusr
 * @create 2022-04-22
 * @package com.whpu.dao
 */
public interface UserMapper {
    List<User> findAll() throws IOException;

    List<User> findByCondition(User user);

    List<User> findByIds(List<Integer> ids);
}
