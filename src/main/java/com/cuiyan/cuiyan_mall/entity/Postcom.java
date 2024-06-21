package com.cuiyan.cuiyan_mall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 帖子评论
 */
@Data
@TableName(value = "postcom")
public class Postcom {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer postId;
    private String reply;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private int deleted;
}
