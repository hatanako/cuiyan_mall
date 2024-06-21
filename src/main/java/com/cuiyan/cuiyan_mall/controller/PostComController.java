package com.cuiyan.cuiyan_mall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.entity.Postcom;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.entity.vo.PostcomVo;
import com.cuiyan.cuiyan_mall.service.PostcomService;
import com.cuiyan.cuiyan_mall.service.UserService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 帖子详情
 * @author: hatana
 * @create: 2024-06-21 15:53
 **/
@RestController
@RequestMapping("/postcom")
public class PostComController {
    @Resource
    private PostcomService service;
    @Autowired
    private ResultMessage resultMessage;

    @RequestMapping("/list")
    public ResultMessage list(){
        List<Postcom> postcoms = service.selectList(null);
        resultMessage.success("200","查询成功", postcoms);
        return resultMessage;
    }

    @RequestMapping("/insert")
    public ResultMessage insert(@RequestBody Postcom postCom){
        service.insert(postCom);
        resultMessage.success("200","插入成功");
        return resultMessage;
    }

    @RequestMapping("/update")
    public ResultMessage update(@RequestBody Postcom postcom){
        service.updateById(postcom);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }

    @RequestMapping("/selectPostId")
    public ResultMessage selectByPostId(@RequestBody Postcom postcom){
        List<PostcomVo> postcoms = service.selectUserWithPostcom(postcom.getId());
        resultMessage.success("200","查询成功",postcoms);
        return resultMessage;
    }
}
