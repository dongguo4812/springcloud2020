package com.dongguo.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author Dongguo
 * @date 2021/7/23 0023 19:19
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}