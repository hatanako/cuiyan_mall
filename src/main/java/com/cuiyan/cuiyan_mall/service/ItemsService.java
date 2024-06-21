package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Items;

import java.util.List;

public interface ItemsService {
    int insert(Items items);
    List<Items> selectList(QueryWrapper queryWrapper);
    Items selectById(int id);
    int deleteById(Items items);
    int updateById(Items items);
}
