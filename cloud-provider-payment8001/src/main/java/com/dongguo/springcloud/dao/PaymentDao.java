package com.dongguo.springcloud.dao;

import com.dongguo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Dongguo
 * @date 2021/7/21 0021 12:39
 * @description:
 */
@Mapper  //import org.apache.ibatis.annotations.Mapper;
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
