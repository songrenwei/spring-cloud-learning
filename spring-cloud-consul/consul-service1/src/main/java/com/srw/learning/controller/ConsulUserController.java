package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:06
 */
@Slf4j
@RestController
@RequestMapping("/consul/service1/user")
public class ConsulUserController {

    @GetMapping("/query")
    public JsonResult<User> query(@RequestParam Long id) throws InterruptedException {
        log.info("...into consul service1...");
        return JsonResult.success(new User(id, "admin", "666666"));
    }

}

