package com.srw.learning.client;

import com.srw.learning.bean.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/20 16:37
 */
@FeignClient(value = "feign-service1", fallback = FeignClientsFallback.class)
public interface FeignClients {

    @GetMapping("/feign/service1/user/query")
    JsonResult<?> query(@RequestParam("id") Long id);

}
