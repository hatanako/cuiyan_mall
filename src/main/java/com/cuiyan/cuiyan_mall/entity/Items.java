package com.cuiyan.cuiyan_mall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 商品信息
 */
@Data
public class Items {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private double price;
    private String type;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private int stock;
    private String introduction;
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    private int deleted;
}
