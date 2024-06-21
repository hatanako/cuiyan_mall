package com.cuiyan.cuiyan_mall.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 用户
 */
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private String country;
    private String address;
    private String phone;
    private String role;
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    private int deleted;
}
