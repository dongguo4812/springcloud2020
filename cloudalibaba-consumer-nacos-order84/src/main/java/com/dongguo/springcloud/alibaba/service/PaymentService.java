package com.dongguo.springcloud.alibaba.service;

import com.dongguo.springcloud.entities.CommonResult;
import com.dongguo.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * @author Dongguo
 * @date 2021/7/26 0026 20:32
 * @description:
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)//调用中关闭9003服务提供者
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
