package com.srw.learning.client;

import com.srw.learning.bean.JsonResult;
import com.srw.learning.bean.User;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/20 17:06
 */
@Component
public class FeignClientsFallback implements FeignClients {

    @Override
    public JsonResult<?> query(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "000000");
        return JsonResult.success(defaultUser);
    }

}
