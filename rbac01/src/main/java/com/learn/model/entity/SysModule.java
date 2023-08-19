package com.learn.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName sys_module
 */
@TableName(value ="sys_module")
@Data
public class SysModule implements Serializable {
    private Integer id;

    private String moduleName;

    private String url;

    private Integer parentId;

    private Integer grade;

    private String optValue;

    private Integer orders;

    private Integer isValid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}