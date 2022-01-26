package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/zuul/service1/user")
public class ZuulUserController {

    @GetMapping("/query")
    public JsonResult<String> query() throws InterruptedException {
        log.info("...start....");
        TimeUnit.SECONDS.sleep(1);
        return JsonResult.success("zuul-service1");
    }

}
