package com.learn.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.dao.SysRoleDao;
import com.learn.mapper.SysRoleMapper;
import com.learn.model.entity.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public class SysRoleDaoImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleDao {
}
