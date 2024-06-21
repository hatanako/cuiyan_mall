package com.cuiyan.cuiyan_mall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Appraise;
import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.mapper.AppraiseMapper;
import com.cuiyan.cuiyan_mall.service.AppraiseService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 商品评论
 * @author: hatana
 * @create: 2024-06-21 18:55
 **/
@RestController
@RequestMapping("/appraise")
public class AppraiseController {
    @Resource
    private AppraiseService service;
    @Resource
    private ResultMessage resultMessage;
    @RequestMapping("/list")
    public ResultMessage findList(){
        List<Appraise> appraise = service.selectList(null);
        resultMessage.success("200","查询成功",appraise);
        return resultMessage;
    }
    @RequestMapping("/insert")
    public ResultMessage insert(@RequestBody Appraise appraise){
        service.insert(appraise);
        resultMessage.success("200","插入成功");
        return resultMessage;
    }
    @RequestMapping("/update")
    public ResultMessage update(@RequestBody Appraise appraise){
        service.updateById(appraise);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
    @RequestMapping("/delete")
    public ResultMessage delete(@RequestBody Appraise appraise){
        service.deleteById(appraise);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
    @RequestMapping("/list_inItem")
    public ResultMessage findListByItemsId(@RequestBody Appraise appraise){
        QueryWrapper<Appraise> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("items_id",appraise.getItemsId());
        List<Appraise> appraises = service.selectList(queryWrapper);
        resultMessage.success("200","查询成功",appraises);
        return resultMessage;
    }
}
