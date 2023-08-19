package com.learn.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.dao.SysUserDao;
import com.learn.mapper.SysUserMapper;
import com.learn.model.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public class SysUserDaoImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserDao {
}
