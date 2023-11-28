package com.size.admin.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.size.admin.biz.service.user.UserService;
import com.size.admin.meta.entity.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@RestController
@RequestMapping("/service/axtone/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/get")
    public User get(@RequestParam(value = "id") Long id) {
        return userService.getById(id);
    }
}
