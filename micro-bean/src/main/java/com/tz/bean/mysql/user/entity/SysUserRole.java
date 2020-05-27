package com.tz.bean.mysql.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author 256g的胃
 * @since 2020-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user_role")
@ApiModel(value="SysUserRole对象", description="用户角色表")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long roleId;


}
