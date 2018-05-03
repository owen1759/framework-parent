package com.jxy.framework.core.service;

import com.jxy.framework.core.entity.UserEntity;

/**
 * 用户信息管理Service层接口
 * @author JiangXiangyu
 * @since 2018-05-04
 */
public interface IUserService {

  UserEntity findById(int id);

}