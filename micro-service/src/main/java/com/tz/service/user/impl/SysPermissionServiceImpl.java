package com.tz.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz.bean.mysql.user.entity.SysPermission;
import com.tz.dao.mysql.user.SysPermissionMapper;
import com.tz.service.user.ISysPermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户权限表 服务实现类
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {

}
