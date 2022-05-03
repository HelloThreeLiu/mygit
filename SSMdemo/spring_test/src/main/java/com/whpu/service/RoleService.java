package com.whpu.service;

import com.whpu.domain.Role;
import com.whpu.domain.User;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.service
 */
public interface RoleService {
    List<Role> list();

    void save(Role role);

}
