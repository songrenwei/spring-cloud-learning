package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.client.FeignClients;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/feign/service2/user")
public class FeignUserController {

    private final FeignClients feignClients;

    @GetMapping("/query/{id}")
    public JsonResult<?> query(@PathVariable Long id) {
        return feignClients.query(id);
    }

}
