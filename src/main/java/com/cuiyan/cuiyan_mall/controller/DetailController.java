package com.cuiyan.cuiyan_mall.controller;

import com.cuiyan.cuiyan_mall.entity.Items;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.mapper.DetailMapper;
import com.cuiyan.cuiyan_mall.mapper.ItemsMapper;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailController {
    @Resource
    private DetailMapper mapper;
    @Autowired
    private ResultMessage resultMessage;

    @RequestMapping("/findDetail")
    public ResultMessage findDetail(@RequestBody User user){
        List<Items> items = mapper.selectDetail(user.getId());

        return resultMessage;
    }
}
