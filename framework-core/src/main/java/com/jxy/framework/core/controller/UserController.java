package com.jxy.framework.core.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jxy.framework.core.entity.User;
import com.jxy.framework.core.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private IUserService userService;

    @RequestMapping("/find")
    public String find(int id) {
        logger.debug("正在查找用户[{}]的信息", id);
        User user = userService.findById(id);
        logger.debug("用户信息：{}", user);
        return "OK";
    }

}