package com.dongguo.springcloud.alibaba.dao;

import com.dongguo.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.naming.Name;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:13
 * @description:
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}