package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.mapper.ItemsMapper;
import com.cuiyan.cuiyan_mall.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper mapper;

    @Override
    public int insert(Items items) {
        return mapper.insert(items);
    }

    @Override
    public List<Items> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Items selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int deleteById(Items items) {
        return mapper.deleteById(items);
    }

    @Override
    public int updateById(Items items) {
        return mapper.updateById(items);
    }
}
