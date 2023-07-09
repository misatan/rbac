package com.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.model.SysUser;
import com.learn.service.SysUserService;
import com.learn.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-07-09 14:18:37
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




