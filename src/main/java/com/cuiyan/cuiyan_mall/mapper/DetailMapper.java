package com.cuiyan.cuiyan_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DetailMapper extends BaseMapper<Detail> {
    List<ItemsVo> selectDetailItems(int id);
}
