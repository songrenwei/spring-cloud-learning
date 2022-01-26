package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:06
 */
@Slf4j
@RestController
@RequestMapping("/nacos/service1")
public class NacosController {

    @GetMapping("/query")
    public JsonResult<User> query(@RequestParam Long id) {
        log.info("...into nacos service1...");
        return JsonResult.success(new User(id, "admin", "666666"));
    }

}

