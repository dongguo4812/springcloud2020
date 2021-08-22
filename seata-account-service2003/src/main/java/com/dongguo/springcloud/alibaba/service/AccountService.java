package com.dongguo.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 14:18
 * @description:
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}