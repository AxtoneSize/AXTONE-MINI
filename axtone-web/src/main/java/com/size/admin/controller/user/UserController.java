package com.size.admin.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.size.admin.biz.service.user.UserService;
import com.size.admin.meta.entity.user.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 用户前端控制器
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@Api("用户前端控制器")
@RestController
@RequestMapping("/controller/axtone/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("获取用户")
    @GetMapping("/get")
    public User get(@RequestParam(value = "id") Long id) {
        return userService.getById(id);
    }
}
