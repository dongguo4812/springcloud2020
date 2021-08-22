package com.dongguo.springcloud.alibaba.controller;

import com.dongguo.springcloud.alibaba.domain.CommonResult;
import com.dongguo.springcloud.alibaba.domain.Order;
import com.dongguo.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:22
 * @description:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}