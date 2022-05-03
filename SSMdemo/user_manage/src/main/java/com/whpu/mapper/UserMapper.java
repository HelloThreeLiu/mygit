package com.whpu.mapper;

import com.whpu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author liusr
 * @create 2022-04-27
 * @package com.whpu.mapper
 */
public interface UserMapper {
    @Select("select * from user where phone=#{phone}")
    User findUserByPhone(String phone);

    @Insert("insert into user(id,phone) values(null,#{phone})")
    void save(User user);
}
