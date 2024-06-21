package com.cuiyan.cuiyan_mall.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @description:
 * @author: hatana
 * @create: 2024-06-20 20:19
 **/
public interface UserService {
    List<User> selectList(QueryWrapper queryWrapper);
    User selectUser(QueryWrapper queryWrapper);
    int insert(User user);
    int deleteById(User user);
    int updateById(User user);
}
