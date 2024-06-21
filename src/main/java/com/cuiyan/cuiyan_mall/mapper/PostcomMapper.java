package com.cuiyan.cuiyan_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.Postcom;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import com.cuiyan.cuiyan_mall.entity.vo.PostcomVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostcomMapper extends BaseMapper<Postcom> {
    List<PostcomVo> selectUserWithPostcom(int id);
}
