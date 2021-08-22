package com.dongguo.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Dongguo
 * @date 2021/7/24 0024 22:34
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}