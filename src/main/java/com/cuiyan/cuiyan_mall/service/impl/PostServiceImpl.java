package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.mapper.PostMapper;
import com.cuiyan.cuiyan_mall.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper mapper;

    @Override
    public int insert(Post post) {
        return mapper.insert(post);
    }

    @Override
    public List<Post> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Post selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int deleteById(Post post) {
        return mapper.deleteById(post);
    }

    @Override
    public int updateById(Post post) {
        return mapper.updateById(post);
    }
}
