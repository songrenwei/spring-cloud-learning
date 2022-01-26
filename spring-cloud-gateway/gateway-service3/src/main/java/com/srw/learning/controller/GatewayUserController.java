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
@RequestMapping("/gateway/service3")
public class GatewayUserController {

    private final RestTemplate restTemplate;

    @GetMapping("/query/{id}")
    public JsonResult<?> query(@PathVariable Long id) {
        log.info("...into gateway service3...");
        ResponseEntity<JsonResult> entity =  restTemplate.getForEntity("http://gateway-service2/gateway/service2/user/query?id={1}", JsonResult.class, id);
        return entity.getBody();
    }

    @GetMapping("/query")
    public JsonResult<?> query2(@RequestParam Long id) {
        log.info("...into gateway service3...");
        ResponseEntity<JsonResult> entity =  restTemplate.getForEntity("http://gateway-service2/gateway/service2/user/query?id={1}", JsonResult.class, id);
        return entity.getBody();
    }

    @GetMapping("/query/byUserName")
    public JsonResult<String> query3(@RequestParam String userName) {
        log.info("...into gateway service3...");
        return JsonResult.success(userName);
    }

}
