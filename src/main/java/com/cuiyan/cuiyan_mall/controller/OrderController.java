package com.cuiyan.cuiyan_mall.controller;

import com.cuiyan.cuiyan_mall.entity.Appraise;
import com.cuiyan.cuiyan_mall.entity.Order;
import com.cuiyan.cuiyan_mall.service.OrderService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 订单
 * @author: hatana
 * @create: 2024-06-21 19:24
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService service;
    @Resource
    private ResultMessage resultMessage;
    @RequestMapping("/list")
    public ResultMessage findList(){
        List<Order> order = service.selectList(null);
        resultMessage.success("200","查询成功",order);
        return resultMessage;
    }
    @RequestMapping("/insert")
    public ResultMessage insert(@RequestBody Order order){
        service.insert(order);
        resultMessage.success("200","插入成功");
        return resultMessage;
    }
    @RequestMapping("/update")
    public ResultMessage update(@RequestBody Order order){
        service.updateById(order);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
    @RequestMapping("/delete")
    public ResultMessage delete(@RequestBody Order order){
        service.deleteById(order);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
}
