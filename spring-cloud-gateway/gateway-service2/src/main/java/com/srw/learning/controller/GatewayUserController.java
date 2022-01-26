package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:06
 */
@Slf4j
@RestController
@RequestMapping("/gateway/service2/user")
public class GatewayUserController {

    @GetMapping("/query")
    public JsonResult<User> query(@RequestParam Long id) {
        log.info("...into gateway service2...");
        return JsonResult.success(new User(id, "admin", "666666"));
    }

}

