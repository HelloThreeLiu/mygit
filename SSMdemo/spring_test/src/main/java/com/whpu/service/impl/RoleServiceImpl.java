package com.whpu.service.impl;

import com.whpu.dao.RoleDao;
import com.whpu.domain.Role;
import com.whpu.domain.User;
import com.whpu.service.RoleService;

import java.util.List;

/**
 * @author liusr
 * @create 2022-04-15
 * @package com.whpu.service.impl
 */
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }
}
