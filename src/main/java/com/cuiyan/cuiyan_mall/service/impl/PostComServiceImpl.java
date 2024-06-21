package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.entity.Postcom;
import com.cuiyan.cuiyan_mall.mapper.PostComMapper;
import com.cuiyan.cuiyan_mall.mapper.PostMapper;
import com.cuiyan.cuiyan_mall.service.PostComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostComServiceImpl implements PostComService {

    @Autowired
    private PostComMapper mapper;


    @Override
    public int insert(Postcom postcom) {
        return mapper.insert(postcom);
    }

    @Override
    public List<Postcom> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Postcom selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int deleteById(Postcom postcom) {
        return mapper.deleteById(postcom);
    }

    @Override
    public int updateById(Postcom postcom) {
        return mapper.updateById(postcom);
    }
}
