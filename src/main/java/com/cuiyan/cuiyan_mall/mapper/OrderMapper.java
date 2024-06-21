package com.cuiyan.cuiyan_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
