package com.dongguo.springcloud.service;
import org.springframework.stereotype.Component;
/**
 * @author Dongguo
 * @date 2021/7/23 0023 14:57
 * @description:
 */
@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fallback paymentInfo_OK-------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fallback paymentInfo_TimeOut-------";
    }
}
