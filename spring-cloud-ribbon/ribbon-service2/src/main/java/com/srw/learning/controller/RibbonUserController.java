package com.srw.learning.controller;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ribbon/service2/user")
public class RibbonUserController {

    private final RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @PostMapping("/create")
    public JsonResult<Long> create(@RequestBody User user) {
        JsonResult<Long> result = restTemplate.postForObject(userServiceUrl + "/create", user, JsonResult.class);
        return JsonResult.success(Objects.nonNull(result)?result.getData():null);
    }

    @PostMapping("/delete/{id}")
    public JsonResult<Long> delete(@PathVariable Long id) {
        restTemplate.postForObject(userServiceUrl + "/delete/{1}", null, JsonResult.class, id);
        return JsonResult.success(id);
    }

    @PostMapping("/update")
    public JsonResult<Long> update(@RequestBody User user) {
        restTemplate.postForObject(userServiceUrl + "/update", user, JsonResult.class);
        return JsonResult.success(user.getId());
    }

    @GetMapping("/query")
    public JsonResult<?> query(@RequestParam Long id) {
        ResponseEntity<JsonResult> entity =  restTemplate.getForEntity(userServiceUrl + "/query?id={1}", JsonResult.class, id);
        return entity.getBody();
    }

    @GetMapping("/query/List")
    public JsonResult<List<User>> queryList() {
        JsonResult<List<User>> result = restTemplate.getForObject(userServiceUrl + "/query/List", JsonResult.class);
        return JsonResult.success(Objects.nonNull(result)?result.getData():null);
    }

}
