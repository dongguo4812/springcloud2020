package com.dongguo.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dongguo
 * @date 2021/7/27 0027 13:23
 * @description:
 */
@Configuration
@MapperScan({"com.dongguo.springcloud.alibaba.dao"})
public class MyBatisConfig {
}