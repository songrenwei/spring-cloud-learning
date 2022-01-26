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
@FeignClient(value = "sleuth-service1", fallback = SleuthClientsFallback.class)
public interface SleuthClients {

    @GetMapping("/sleuth/service1/user/query")
    JsonResult<?> query(@RequestParam("id") Long id);

}
