package com.srw.learning.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.srw.learning.bean.JsonResult;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/26 15:20
 */
public class CustomBlockHandler {

    public static JsonResult<String> handleException(BlockException exception){
        return JsonResult.error("请求过于频繁，请稍后再试!");
    }
}
