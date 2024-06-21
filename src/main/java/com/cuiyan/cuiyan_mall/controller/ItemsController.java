package com.cuiyan.cuiyan_mall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.mapper.ItemsMapper;
import com.cuiyan.cuiyan_mall.mapper.UserMapper;
import com.cuiyan.cuiyan_mall.service.ItemsService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @Resource
    private ItemsService service;
    @Resource
    private ResultMessage resultMessage;
    @RequestMapping("/add")
    public ResultMessage add(@RequestBody Items items){
        service.insert(items);
        resultMessage.success("200","添加商品成功");
        return resultMessage;
    }

    @RequestMapping("/list")
    public ResultMessage list() {
        List<Items> items = service.selectList(null);
        resultMessage.success("200", "查询成功", items);
        return resultMessage;
    }
    @RequestMapping("/findOne")
    public ResultMessage findItemById(@RequestBody Items items){
        Items items1 = service.selectById(items.getId());
        resultMessage.success("200","查询成功",items1);
        return resultMessage;
    }

    @RequestMapping("/findByName")
    public ResultMessage findByName(@RequestBody Items items) {
        QueryWrapper<Items> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",items.getName());
        List<Items> items1 = service.selectList(queryWrapper);
        if (items1!=null){
            resultMessage.success("200","查询成功",items1);
        } else {
            resultMessage.success("500","商品不存在");
        }
        return resultMessage;
    }

    @RequestMapping("/delete")
    public ResultMessage delete(@RequestBody Items items) {
        service.deleteById(items);
        resultMessage.success("200", "删除成功");
        return resultMessage;
    }

    @RequestMapping("/update")
    public ResultMessage update(@RequestBody Items items) {
        service.updateById(items);
        resultMessage.success("200", "更新成功");
        return resultMessage;
    }
}
