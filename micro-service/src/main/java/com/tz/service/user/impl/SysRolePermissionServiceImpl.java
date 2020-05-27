package com.tz.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tz.bean.mysql.user.entity.SysRolePermission;
import com.tz.dao.mysql.user.SysRolePermissionMapper;
import com.tz.service.user.ISysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色权限表 服务实现类
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission> implements ISysRolePermissionService {

}
