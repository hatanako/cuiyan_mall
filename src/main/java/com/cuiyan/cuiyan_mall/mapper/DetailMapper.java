package com.cuiyan.cuiyan_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Mapper
public interface DetailMapper extends BaseMapper<Detail> {
    List<ItemsVo> selectDetailItems(int id);
}
