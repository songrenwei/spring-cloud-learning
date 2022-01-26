package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
@RequestMapping("/ribbon/service1/user")
public class RibbonUserController {

    @PostMapping("/create")
    public JsonResult<Long> create(@RequestBody User user) {
        return JsonResult.success(user.getId());
    }

    @PostMapping("/delete/{id}")
    public JsonResult<Long> delete(@PathVariable Long id) {
        return JsonResult.success(id);
    }

    @PostMapping("/update")
    public JsonResult<Long> update(@RequestBody User user) {
        return JsonResult.success(user.getId());
    }

    @GetMapping("/query")
    public JsonResult<User> query(@RequestParam Long id) throws InterruptedException {
        log.info("...into ribbon service1...");
//        TimeUnit.MILLISECONDS.sleep(2000);
        return JsonResult.success(new User(id, "admin", "666666"));
    }

    @GetMapping("/query/List")
    public JsonResult<List<User>> queryList() {
        return JsonResult.success(Arrays.asList(new User(1L, "admin", "666666"), new User(2L, "admin", "666666")));
    }

}

