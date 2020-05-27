package com.tz.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tz.bean.mysql.user.entity.SysUser;

/**
 * <p>
 * 当前系统用户 服务类
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 创建用户测试
     * @param sysUser
     * @return
     */
    SysUser createUser(SysUser sysUser);
}
