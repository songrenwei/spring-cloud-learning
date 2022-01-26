package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/nacos/service2")
public class NacosController {

    private final RestTemplate restTemplate;

    @GetMapping("/query/{id}")
    public JsonResult<?> query(@PathVariable Long id) {
        ResponseEntity<JsonResult> entity =  restTemplate.getForEntity("http://nacos-service1/nacos/service1/query?id={1}", JsonResult.class, id);
        return entity.getBody();
    }

}
