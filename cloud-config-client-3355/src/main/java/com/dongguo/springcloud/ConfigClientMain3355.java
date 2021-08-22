package com.dongguo.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author Dongguo
 * @date 2021/7/24 0024 9:24
 * @description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}