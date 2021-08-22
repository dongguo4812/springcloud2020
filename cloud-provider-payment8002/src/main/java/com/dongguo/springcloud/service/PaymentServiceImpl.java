package com.dongguo.springcloud.service;

import com.dongguo.springcloud.dao.PaymentDao;
import com.dongguo.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Dongguo
 * @date 2021/7/21 0021 12:54
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}