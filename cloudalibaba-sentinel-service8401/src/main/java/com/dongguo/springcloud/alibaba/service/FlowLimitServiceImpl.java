package com.dongguo.springcloud.alibaba.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;


/**
 * @author Dongguo
 * @date 2021/7/26 0026 11:00
 * @description:
 */
@Service
public class FlowLimitServiceImpl {

    @SentinelResource("dosomething")       // 将此方法标注为sentinel的资源。value=资源名
    public String dosomething() {
        return "do something";
    }
}