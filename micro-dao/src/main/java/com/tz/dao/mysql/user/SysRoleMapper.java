package com.tz.dao.mysql.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tz.bean.mysql.user.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Mapper
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
