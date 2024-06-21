package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Postcom;
import com.cuiyan.cuiyan_mall.entity.vo.PostcomVo;
import com.cuiyan.cuiyan_mall.mapper.PostcomMapper;
import com.cuiyan.cuiyan_mall.service.PostcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostcomServiceImpl implements PostcomService {

    @Autowired
    private PostcomMapper mapper;


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

    @Override
    public List<PostcomVo> selectUserWithPostcom(int id) {
        return mapper.selectUserWithPostcom(id);
    }
}
