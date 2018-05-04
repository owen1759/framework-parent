package com.jxy.framework.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxy.framework.core.entity.UserEntity;
import com.jxy.framework.core.mapper.UserMapper;
import com.jxy.framework.core.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

  @Resource
  private UserMapper userMapper;

  @Override
  public UserEntity findById(int id) {
    return userMapper.findById(id);
  }

}