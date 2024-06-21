package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Post;

import java.util.List;

public interface PostService {
    int insert(Post post);

    List<Post> selectList(QueryWrapper queryWrapper);

    Post selectById(int id);

    int deleteById(Post post);

    int updateById(Post post);

}
