package com.mars.monkey.user.dao.mapper;

import com.mars.monkey.user.dao.entity.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Long roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}