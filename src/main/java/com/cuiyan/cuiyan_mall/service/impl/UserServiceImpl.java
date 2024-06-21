package com.cuiyan.cuiyan_mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuiyan.cuiyan_mall.entity.User;
import com.cuiyan.cuiyan_mall.mapper.UserMapper;
import com.cuiyan.cuiyan_mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: hatana
 * @create: 2024-06-20 20:37
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> selectList(QueryWrapper queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public User selectUser(QueryWrapper queryWrapper) {
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public int insert(User user) {
        return mapper.insert(user);
    }

    @Override
    public int deleteById(User user) {
        return mapper.deleteById(user);
    }

    @Override
    public int updateById(User user) {
        return mapper.updateById(user);
    }

}
