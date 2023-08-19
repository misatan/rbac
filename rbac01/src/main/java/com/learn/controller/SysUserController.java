package com.learn.controller;

import com.learn.model.dto.sysUser.RegisterDTO;
import com.learn.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sys_user")
public class SysUserController {
    private SysUserService sysUserService;

    @Autowired
    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @PostMapping("register")
    public void register(RegisterDTO registerDTO){
        //注册逻辑
        sysUserService.register(registerDTO);
        //后置处理逻辑
    }
}
