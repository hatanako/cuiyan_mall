package com.cuiyan.cuiyan_mall.controller;

import com.cuiyan.cuiyan_mall.entity.Post;
import com.cuiyan.cuiyan_mall.service.PostService;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 帖子
 * @author: hatana
 * @create: 2024-06-21 18:47
 **/
@RestController
@RequestMapping("/post")
public class PostController {
    @Resource
    private PostService service;
    @Resource
    private ResultMessage resultMessage;
    @RequestMapping("/list")
    public ResultMessage findList(){
        List<Post> posts = service.selectList(null);
        resultMessage.success("200","查询成功",posts);
        return resultMessage;
    }
    @RequestMapping("/insert")
    public ResultMessage insert(@RequestBody Post post){
        service.insert(post);
        resultMessage.success("200","插入成功");
        return resultMessage;
    }
    @RequestMapping("/update")
    public ResultMessage update(@RequestBody Post post){
        service.updateById(post);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
    @RequestMapping("/delete")
    public ResultMessage delete(@RequestBody Post post){
        service.deleteById(post);
        resultMessage.success("200","更新成功");
        return resultMessage;
    }
}
