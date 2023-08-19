package com.learn.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@TableName(value ="sys_role")
@Data
public class SysRole implements Serializable {
    private Integer id;

    private String roleName;

    private String remark;

    private Integer isValid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}