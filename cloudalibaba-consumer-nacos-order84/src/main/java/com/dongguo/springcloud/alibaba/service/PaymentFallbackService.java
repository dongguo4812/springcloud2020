package com.dongguo.springcloud.alibaba.service;

import com.dongguo.springcloud.entities.CommonResult;
import com.dongguo.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Dongguo
 * @date 2021/7/26 0026 20:33
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}