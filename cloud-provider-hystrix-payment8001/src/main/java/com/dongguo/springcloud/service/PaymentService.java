package com.dongguo.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Dongguo
 * @date 2021/7/23 0023 12:51
 * @description:
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);


    public String paymentInfo_TimeOut(Integer id);

    public String paymentInfo_TimeOutHandler(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);
}
