package com.dongguo.springcloud.controller;
import com.dongguo.springcloud.entities.CommonResult;
import com.dongguo.springcloud.entities.Payment;
import com.dongguo.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @author Dongguo
 * @date 2021/7/23 0023 10:31
 * @description:
 */
@RestController
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }


    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut()
    {
        return paymentFeignService.paymentFeignTimeOut();
    }
}
