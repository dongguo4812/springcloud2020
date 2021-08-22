package com.dongguo.springcloud.controller;

import com.dongguo.springcloud.entities.CommonResult;
import com.dongguo.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dongguo
 * @date 2021/7/21 0021 15:38
 * @description:
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PaymentSrv_URL = "http://localhost:8001";//先写死，后续通过读配置的方式获取CLOUD-PAYMENT-SERVICE
    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(Payment payment)
    {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create",payment,CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/"+id, CommonResult.class, id);
    }


    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject(PaymentSrv_URL +"/payment/zipkin/", String.class);
        return result;
    }

}