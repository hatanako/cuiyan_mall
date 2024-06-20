package com.cuiyan.cuiyan_mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuiyan.cuiyan_mall.entity.Detail;
import com.cuiyan.cuiyan_mall.entity.Items;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
@Repository
public interface DetailMapper extends BaseMapper<Detail> {
    @Select("select user.name,items.*,order.id oid,detail.num " +
            "from user,items,detail,order " +
            "where user.id = order.user_id and order.detail_id = detail.id and detail.items_id=items.id and user.id = #{id}")
    List<Items> selectDetail(int id);

}
