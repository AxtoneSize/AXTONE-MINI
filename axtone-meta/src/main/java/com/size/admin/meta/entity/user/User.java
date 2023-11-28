package com.size.admin.meta.entity.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.size.admin.meta.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_user")
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private long id;
    private String name;
}
