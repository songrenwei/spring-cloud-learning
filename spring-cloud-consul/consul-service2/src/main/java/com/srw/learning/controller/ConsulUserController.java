package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/consul/service2/user")
public class ConsulUserController {

    private final RestTemplate restTemplate;

    @GetMapping("/query")
    public JsonResult<?> query(@RequestParam Long id) {
        log.info("...into consul service2...");
        ResponseEntity<JsonResult> entity =  restTemplate.getForEntity("http://consul-service1/consul/service1/user/query?id={1}", JsonResult.class, id);
        return entity.getBody();
    }

}
