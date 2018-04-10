package com.jxy.framework.core.mapper;

import org.springframework.dao.DataAccessException;

import com.jxy.framework.core.entity.User;

/**
 * 用户信息管理Dao层
 * @author JiangXiangyu
 * @since 2018-04-10
 */
public interface UserMapper {

    /**
     * 通过主键ID查找用户信息
     * @param id 主键ID
     * @return 用户信息
     * @throws DataAccessException
     */
    User findById(int id);

}