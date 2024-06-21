package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import com.cuiyan.cuiyan_mall.mapper.DetailMapper;
import com.cuiyan.cuiyan_mall.service.DetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Resource
    private DetailMapper mapper;

    @Override
    public List<ItemsVo> findDetailItems(int order_id) {
        return mapper.selectDetailItems(order_id);
    }

    @Override
    public int insertBatch(List<Detail> details) {
        int i=0;
        for (Detail o:details){
            mapper.insert(o);
            i++;
        }
        return i;
    }

    @Override
    public int deleteBatch(List<Detail> details) {
        int i=0;
        for (Detail detail:details){
            mapper.deleteById(detail);
            i++;
        }
        return i;
    }
}
