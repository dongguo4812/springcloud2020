package com.dongguo.springcloud.alibaba.service;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:59
 * @description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
