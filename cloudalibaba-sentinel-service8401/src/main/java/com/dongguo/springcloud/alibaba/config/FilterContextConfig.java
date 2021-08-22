package com.dongguo.springcloud.alibaba.config;
import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dongguo
 * @date 2021/7/26 0026 11:15
 * @description:
 */
@Configuration
public class FilterContextConfig {

    @Bean
    public FilterRegistrationBean sentinelFilterRegistration() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new CommonFilter());
        registrationBean.addUrlPatterns("/*");
        // 入口资源关闭聚合
        registrationBean.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");//.2.1.0RELEASE的CommonFilter类中，没有WEB_CONTEXT_UNIFY属性
        registrationBean.setName("sentinelFilter");
        registrationBean.setOrder(1);

        return registrationBean;
    }
}