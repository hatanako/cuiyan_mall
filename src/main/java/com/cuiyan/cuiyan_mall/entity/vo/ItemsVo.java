package com.cuiyan.cuiyan_mall.entity.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
public class ItemsVo extends Items{
    private String username;
    private int oid;
    private int num;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ocTime;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ouTime;
}
