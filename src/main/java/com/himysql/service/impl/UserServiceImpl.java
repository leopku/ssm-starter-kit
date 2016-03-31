package com.himysql.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.himysql.mybatis.dao.UserMapper;
import com.himysql.mybatis.model.User;

@Service("userService")
public class UserServiceImpl {
  @Resource
  private UserMapper userDao;
  
  public User getUserById(int userId){
    return this.userDao.selectByPrimaryKey(userId);
  }
  
}
