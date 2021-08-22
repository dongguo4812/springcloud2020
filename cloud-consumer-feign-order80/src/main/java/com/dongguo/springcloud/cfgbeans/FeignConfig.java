package com.dongguo.springcloud.cfgbeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;
/**
 * @author Dongguo
 * @date 2021/7/23 0023 11:08
 * @description:
 */
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}