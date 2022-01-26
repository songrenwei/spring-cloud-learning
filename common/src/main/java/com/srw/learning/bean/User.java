package com.srw.learning.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: songrenwei
 * @Date: 2022/1/19 17:46
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String userName;

    private String password;

}
