package com.it.mapper;

import com.it.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // 查询所有学生信息
    List<User> getAll();
}
