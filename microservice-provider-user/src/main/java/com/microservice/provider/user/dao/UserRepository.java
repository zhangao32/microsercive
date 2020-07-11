package com.microservice.provider.user.dao;

import com.microservice.provider.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface UserRepository{
    @Select("select * from user where id=#{id}")
    User findById(int id);
}
