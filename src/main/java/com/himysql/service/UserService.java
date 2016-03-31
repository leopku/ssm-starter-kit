package com.himysql.service;

import com.himysql.mybatis.model.User;

public interface UserService {
  public User getUserById(int userId);
}
