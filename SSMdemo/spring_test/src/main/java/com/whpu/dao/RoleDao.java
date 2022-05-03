package com.whpu.dao;

import com.whpu.domain.Role;
import com.whpu.domain.User;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.dao
 */
public interface RoleDao {
    List<Role> findAll();

    void save(Role role);

    List<Role> findRoleByUserId(Long id);
}
