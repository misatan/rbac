package com.learn.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.dao.SysModuleDao;
import com.learn.mapper.SysModuleMapper;
import com.learn.model.entity.SysModule;
import org.springframework.stereotype.Repository;

@Repository
public class SysModuleDaoImpl extends ServiceImpl<SysModuleMapper, SysModule> implements SysModuleDao {
}
