package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Order;

import java.util.List;

public interface OrderService {
    int insert(Order order);
    List<Order> selectList(QueryWrapper queryWrapper);
    Order selectById(int id);
    int deleteById(Order order);
    int updateById(Order order);
}
