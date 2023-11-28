package com.size.admin.meta.entity.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/28
 */
@Data
public class BaseEntity implements Serializable {

    private Date createTime;
    private Date updateTime;
}
