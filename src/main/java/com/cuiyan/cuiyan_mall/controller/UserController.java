package com.cuiyan.cuiyan_mall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.mapper.UserMapper;
import com.cuiyan.cuiyan_mall.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper mapper;
    @Autowired
    private ResultMessage resultMessage;

    @RequestMapping("/list")
    public ResultMessage list() {
        List<User> users = mapper.selectList(null);
        System.out.println("users = " + users);
        resultMessage.success("200", "查询成功", users);
//        System.out.println(resultMessage.getData());
        return resultMessage;
    }

    @RequestMapping("/login")
    public ResultMessage login(@RequestBody User user){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",user.getName());
        User user1 = mapper.selectOne(queryWrapper);
        if (user1 == null) {
            resultMessage.success("100", "用户名不存在");
        } else if (user1.getPassword().equals(user.getPassword())) {
            resultMessage.success("200", "登录成功", user1);
        } else {
            resultMessage.success("100", "密码错误");
        }
        return resultMessage;
    }

    @RequestMapping("/register")
    public ResultMessage register(@RequestBody User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",user.getName());
        List<User> users = mapper.selectList(queryWrapper);
        if (!users.isEmpty()) {
            resultMessage.success("100", "用户名已被使用");
        } else {
            mapper.insert(user);
            System.out.println(user);
            resultMessage.success("200", "注册成功");
        }
        return resultMessage;
    }

    @RequestMapping("/delete")
    public ResultMessage delete(@RequestBody User user) {
        mapper.deleteById(user);
        resultMessage.success("200", "删除成功");
        return resultMessage;
    }

    @RequestMapping("/update")
    public ResultMessage update(@RequestBody User user) {
        mapper.updateById(user);
        resultMessage.success("200", "更新成功");
        return resultMessage;
    }
}
