package com.cuiyan.cuiyan_mall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
    商品评论
 */
@Data
@TableName(value = "appraise")
public class Appraise {
    @TableId(type = IdType.AUTO)
    private int id;
    private int items_id;
    private int user_id;
    private String text;
    private String img;
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    private int deleted;
}
