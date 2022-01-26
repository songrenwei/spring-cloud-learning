package com.srw.learning.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/20 15:17
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class HystrixClients {

    private final RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @HystrixCommand(fallbackMethod = "fallback")
    public JsonResult<?> testFallback(Long id) {
        return restTemplate.getForObject(userServiceUrl + "/user/query?id={1}", JsonResult.class, id);
    }

    public JsonResult<?> fallback(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "000000");
        return JsonResult.success(defaultUser);
    }

}
