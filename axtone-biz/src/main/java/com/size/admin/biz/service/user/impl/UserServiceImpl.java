package com.size.admin.biz.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.size.admin.biz.service.user.UserService;
import com.size.admin.mapper.user.UserMapper;
import com.size.admin.meta.entity.user.User;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
