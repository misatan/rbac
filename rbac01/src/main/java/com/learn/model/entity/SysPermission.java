package com.learn.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@TableName(value ="sys_permission")
@Data
public class SysPermission implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer moduleId;

    private String aclValue;

    private Integer isValid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}