package com.dongguo.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dongguo.springcloud.alibaba.service.FlowLimitServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Dongguo
 * @date 2021/7/26 0026 9:36
 * @description:
 */
@RestController
@Slf4j
public class FlowLimitController{
    @Resource
    private FlowLimitServiceImpl flowLimitService;


    @GetMapping("/testA")
    public String testA()
    {
        log.info(Thread.currentThread().getName()+"------testA");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }


    @GetMapping("/testC")
    public String testC()
    {
        return flowLimitService.dosomething();
    }

    @GetMapping("/testD")
    public String testD()
    {
        return flowLimitService.dosomething();
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
//        int num = 10/0;
        return "------testHotKey-OK";
    }
    public String dealHandler_testHotKey(String p1, String p2, BlockException exception)
    {
        return "-----dealHandler_testHotKey-error";
    }
}