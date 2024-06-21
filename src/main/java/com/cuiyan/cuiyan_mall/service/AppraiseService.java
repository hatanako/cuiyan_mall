package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Appraise;

import java.util.List;

public interface AppraiseService {
    int insert(Appraise appraise);

    List<Appraise> selectList(QueryWrapper queryWrapper);

    Appraise selectById(int id);

    int deleteById(Appraise appraise);

    int updateById(Appraise appraise);
}
