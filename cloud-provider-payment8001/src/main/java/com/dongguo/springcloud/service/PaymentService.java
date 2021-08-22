package com.dongguo.springcloud.service;


import com.dongguo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
/**
 * @author Dongguo
 * @date 2021/7/21 0021 12:53
 * @description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
