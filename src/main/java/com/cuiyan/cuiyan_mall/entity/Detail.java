package com.cuiyan.cuiyan_mall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 订单详情
 */
@Data
@TableName(value = "detail")
public class Detail {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private int itemsId;
    private int num;
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    private int deleted;
}
