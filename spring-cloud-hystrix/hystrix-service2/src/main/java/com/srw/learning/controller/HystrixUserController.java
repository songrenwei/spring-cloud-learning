package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.client.HystrixClients;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/hystrix/service2/user")
public class HystrixUserController {

    private final HystrixClients hystrixClients;

    @GetMapping("/fallBack/{id}")
    public JsonResult<?> testFallback(@PathVariable Long id) {
        return hystrixClients.testFallback(id);
    }

}
