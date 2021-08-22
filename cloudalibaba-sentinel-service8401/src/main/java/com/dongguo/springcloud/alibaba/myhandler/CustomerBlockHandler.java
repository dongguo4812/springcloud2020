package com.dongguo.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dongguo.springcloud.entities.CommonResult;

/**
 * @author Dongguo
 * @date 2021/7/26 0026 16:36
 * @description:
 */
public class CustomerBlockHandler {
    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(1111,"自定义的限流处理信息......CustomerBlockHandler-handleException1");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2222,"自定义的限流处理信息......CustomerBlockHandle-handleException2r");
    }
}