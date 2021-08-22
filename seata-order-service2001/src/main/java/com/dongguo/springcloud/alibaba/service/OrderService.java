package com.dongguo.springcloud.alibaba.service;

import com.dongguo.springcloud.alibaba.domain.Order;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:16
 * @description:
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
