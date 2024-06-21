package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.entity.Postcom;

import java.util.List;

public interface PostComService {
    int insert(Postcom postcom);

    List<Postcom> selectList(QueryWrapper queryWrapper);

    Postcom selectById(int id);

    int deleteById(Postcom postcom);

    int updateById(Postcom postcom);
}
