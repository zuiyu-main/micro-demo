package com.tz.bean.mysql.user.entity;

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
@ApiModel(value="SysRole对象", description="用户角色表")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long roleId;

    private String roleName;


}
