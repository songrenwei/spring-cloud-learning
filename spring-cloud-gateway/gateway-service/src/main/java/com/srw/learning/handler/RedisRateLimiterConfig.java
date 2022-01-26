package com.srw.learning.handler;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/25 15:20
 */
@Configuration
public class RedisRateLimiterConfig {

    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userName"));
    }

//    @Bean
//    public KeyResolver ipKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
//    }
//
//    @Bean
//    public KeyResolver pathKeyResolver(){
//        return exchange -> Mono.just(exchange.getRequest().getURI().getPath());
//    }

}

