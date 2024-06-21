package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Order;
import com.cuiyan.cuiyan_mall.mapper.OrderMapper;
import com.cuiyan.cuiyan_mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;

    @Override
    public int insert(Order order) {
        return mapper.insert(order);
    }

    @Override
    public List<Order> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Order selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int deleteById(Order order) {
        return mapper.deleteById(order);
    }

    @Override
    public int updateById(Order order) {
        return mapper.updateById(order);
    }
}
