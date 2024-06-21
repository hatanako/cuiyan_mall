package com.cuiyan.cuiyan_mall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.entity.Order;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.entity.vo.ItemsVo;
import com.cuiyan.cuiyan_mall.mapper.DetailMapper;
import com.cuiyan.cuiyan_mall.mapper.ItemsMapper;
import com.cuiyan.cuiyan_mall.service.DetailService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailController {
    @Resource
    private DetailService service;
    @Autowired
    private ResultMessage resultMessage;

    @RequestMapping("/findDetail")
    public ResultMessage findDetail(@RequestBody Order order){
        List<ItemsVo> itemsVos = service.findDetailItems(order.getId());
        System.out.println("itemsVos = " + itemsVos);
        resultMessage.success("200","查询成功",itemsVos);
        return resultMessage;
    }
    @RequestMapping("/insertBatch")
    public ResultMessage insertBatch(@RequestBody List<Detail> details){
        int i = service.insertBatch(details);
        if (i==0)
            resultMessage.success("500","插入失败");
        else
            resultMessage.success("200","插入成功");
        return resultMessage;
    }
    @RequestMapping("/delete")
    public ResultMessage deleteBatch(@RequestBody List<Detail> details){
        int i = service.deleteBatch(details);
        if (i==0)
            resultMessage.success("500","删除失败");
        else
            resultMessage.success("200","删除成功");
        return resultMessage;
    }

}
