package com.dongguo.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:56
 * @description:
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}