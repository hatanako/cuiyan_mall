package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Appraise;
import com.cuiyan.cuiyan_mall.mapper.AppraiseMapper;
import com.cuiyan.cuiyan_mall.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements AppraiseService {
    @Autowired
    private AppraiseMapper mapper;


    @Override
    public int insert(Appraise appraise) {
        return mapper.insert(appraise);
    }

    @Override
    public List<Appraise> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Appraise selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int deleteById(Appraise appraise) {
        return mapper.deleteById(appraise);
    }

    @Override
    public int updateById(Appraise appraise) {
        return mapper.updateById(appraise);
    }
}
