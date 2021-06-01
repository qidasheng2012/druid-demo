package com.it.service;

import com.it.domain.User;

import java.util.List;

public interface UserService {
    // 查询所有学生信息
    List<User> getAll();
}
