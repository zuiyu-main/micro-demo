package com.tz.web.user.controller;


import com.tz.bean.mysql.user.entity.SysUser;
import com.tz.service.user.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 当前系统用户 前端控制器
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@RestController
@RequestMapping("/user/sys-user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;
    @PostMapping("/createUser")
    public String createUser(){
        SysUser sysUser = new SysUser();
        sysUser.setDeleted(0);
        sysUser.setFullName("全名");
        sysUser.setPassword("123456");
        sysUser.setSalt("sale");
        sysUser.setUserId(101L);
        sysUser.setUserName("test");
        SysUser sysUser1 = sysUserService.createUser(sysUser);
        return sysUser1.toString();
    }

}
