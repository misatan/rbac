package com.learn.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.dao.SysPermissionDao;
import com.learn.mapper.SysPermissionMapper;
import com.learn.model.entity.SysPermission;
import org.springframework.stereotype.Repository;

@Repository
public class SysPermissionDaoImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionDao {
}
