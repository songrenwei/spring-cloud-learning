package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/zuul/service2/user")
public class ZuulUserController {

    @GetMapping("/query")
    public JsonResult<String> query() {
        return JsonResult.success("zuul-service2");
    }

}
