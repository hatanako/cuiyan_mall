package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import org.springframework.context.annotation.Primary;

import java.util.List;


public interface DetailService {

    List<ItemsVo> findDetailItems(int order_id);
    int insertBatch(List<Detail> details);
    int deleteBatch(List<Detail> details);
}
