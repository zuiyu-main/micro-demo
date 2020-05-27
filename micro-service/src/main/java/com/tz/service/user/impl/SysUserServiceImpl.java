package com.tz.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz.bean.mysql.user.entity.SysUser;
import com.tz.dao.mysql.user.SysUserMapper;
import com.tz.service.user.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 当前系统用户 服务实现类
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    @Qualifier(value = "sysUserMapper")
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser createUser(SysUser sysUser) {
        int insert = sysUserMapper.insert(sysUser);
        System.out.println("保存结果:"+insert);
        SysUser sysUser1 = sysUserMapper.selectById(sysUser.getUserId());
        return sysUser1;
    }
}
