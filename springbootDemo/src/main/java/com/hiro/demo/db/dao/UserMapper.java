package com.hiro.demo.db.dao;

import com.hiro.demo.db.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Project: springbootDemo
 *
 * @author : hirolin
 * @date : 2019/3/25 22:14
 */
@Mapper
public interface UserMapper {

    User getUser(@Param("id") int id);
}
