package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Postcom;
import com.cuiyan.cuiyan_mall.entity.vo.PostcomVo;

import java.util.List;

public interface PostcomService {
    int insert(Postcom postcom);

    List<Postcom> selectList(QueryWrapper queryWrapper);

    Postcom selectById(int id);

    int deleteById(Postcom postcom);

    int updateById(Postcom postcom);
    List<PostcomVo> selectUserWithPostcom(int id);
}
